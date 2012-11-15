package com.example.groupbattle2;

import java.io.BufferedInputStream;
import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONException;
import org.json.JSONObject;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.http.AndroidHttpClient;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.groupbattle2.SessionEvents.AuthListener;
import com.example.groupbattle2.SessionEvents.LogoutListener;

public class MainActivity extends Activity {
	
	final static int AUTHORIZE_ACTIVITY_RESULT_CODE = 0;

	
	
	
	private LoginButton mLoginButton;
    private Handler mHandler;
    public static AndroidHttpClient httpclient = null;
    
    
	
    @SuppressLint("NewApi")
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mHandler = new Handler();
        
        
        
        SessionEvents.addAuthListener(new FbAPIsAuthListener());
        //SessionEvents.addLogoutListener(new FbAPIsLogoutListener());
       
        String[] permissions = { "offline_access", "email", "user_photos", "user_birthday"};

        mLoginButton = (LoginButton) findViewById(R.id.login);

        
        
        /*
         * Source Tag: login_tag
         */
       mLoginButton.init(this, AUTHORIZE_ACTIVITY_RESULT_CODE, Utility.mFacebook, permissions);

        

         
        //StrictMode.setThreadPolicy( new StrictMode.ThreadPolicy.Builder().detectDiskReads().detectDiskWrites().detectNetwork().detectAll ( ).penaltyLog().build());
        
        /*
        if(!ServerManager.IsUserExist())
        {
        	ServerManager.AddFacebookUser();
        	ServerManager.IsUserExist();	
        }
        
        ServerManager.GetListOfGlobalContests();*/
        
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        switch (requestCode) {
        /*
         * if this is the activity result from authorization flow, do a call
         * back to authorizeCallback Source Tag: login_tag
         */
            case AUTHORIZE_ACTIVITY_RESULT_CODE: {
            	Utility.mFacebook.authorizeCallback(requestCode, resultCode, data);
                break;
            }
           
            
        }
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_main, menu);
        return true;
    }
    

    


	/*
     * Callback for fetching current user's name, picture, uid.
     */
    
    
    private class DownloadImageTask extends AsyncTask {
        protected Object doInBackground(Object... urls) {
        	Bitmap bm = null;
			try {
				URL aURL;
				aURL = new URL((String)urls[0]);
				URLConnection conn = aURL.openConnection();
	            conn.connect();
	            InputStream is = conn.getInputStream();
	            BufferedInputStream bis = new BufferedInputStream(is);
	            bm = BitmapFactory.decodeStream(new FlushedInputStream(is));
	            bis.close();
	            is.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} finally{
				if (httpclient != null) {
	                httpclient.close();
	            }
			}
            return bm;
        }
        
        @Override
        protected void onPostExecute(Object result) {
        	//mUserPic.setImageBitmap((Bitmap)result);
        } 
        

    }
    /*
     * Request user name, and picture to show on the main screen.
     */
    public void requestUserData() {
        //mText.setText("Fetching user name, profile pic...");
        Bundle params = new Bundle();
        params.putString("fields", "picture, name");
        
        Utility.mAsyncRunner.request("me", params, new UserRequestListener());
    }
    
    public class UserRequestListener extends BaseRequestListener {

        @Override
        public void onComplete(final String response, final Object state) {
            JSONObject jsonObject;
            try {
                jsonObject = new JSONObject(response);

                final String picURL = jsonObject.getString("picture");
                final String name = jsonObject.getString("name");
                Utility.mFacebookUserID = jsonObject.getString("id");
                
                mHandler.post(new Runnable() {
                    @Override
                    public void run() {
                    	Utility.userName = name;
                        
                        new DownloadImageTask().execute(picURL);
                    }
                });

            } catch (JSONException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

    }
    
    public class FbAPIsAuthListener implements AuthListener {

    	@Override
    	public void onAuthSucceed() {
    		if (Utility.mFacebook.isSessionValid()) {
            	final class LoginToServer extends AsyncTask<Void, Void, Void>
        		{

        			@Override
        			protected Void doInBackground ( Void... params ){
        				
        				
        				boolean res = ServerManager.LoginToServer();
        				
        				if(res)
        				{
        					//ServerManager.GetContestLists();
        				}
        				else
        				{
        					
        				}
        				
        				
        				return null;
        			}
        	
        			@Override
        			protected void onPostExecute(Void v){
        				finish();
        	            Intent intent = new Intent().setClass(MainActivity.this, Contests.class);
        	            startActivity(intent);
        			}
        		}
        		new LoginToServer().execute();
            }
    		
    	}

    	@Override
    	public void onAuthFail(String error) {
    		Utility.Assert("failed to login");
    	}
    }
    
    static class FlushedInputStream extends FilterInputStream {
        public FlushedInputStream(InputStream inputStream) {
            super(inputStream);
        }

        @Override
        public long skip(long n) throws IOException {
            long totalBytesSkipped = 0L;
            while (totalBytesSkipped < n) {
                long bytesSkipped = in.skip(n - totalBytesSkipped);
                if (bytesSkipped == 0L) {
                    int b = read();
                    if (b < 0) {
                        break; // we reached EOF
                    } else {
                        bytesSkipped = 1; // we read one byte
                    }
                }
                totalBytesSkipped += bytesSkipped;
            }
            return totalBytesSkipped;
        }
    }
}



