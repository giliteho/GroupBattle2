package com.example.groupbattle2;

import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

import org.json.JSONObject;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;

import com.example.groupbattle2.MainActivity.FlushedInputStream;
import com.facebook.android.AsyncFacebookRunner;
import com.facebook.android.Facebook;

public class SplashActivity extends Activity {

	public static final String APP_ID = "516934938333150";
	private Handler mHandler;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        
        Utility.mFacebook = new Facebook(APP_ID);
        Utility.mAsyncRunner = new AsyncFacebookRunner(Utility.mFacebook);
        
        //SessionStore.clear(this);
        
        // restore session if one exists
        SessionStore.restore(Utility.mFacebook, this);
        
        Utility.mFacebook.extendAccessTokenIfNeeded(this, null);
        
        if(Utility.mFacebook.isSessionValid())
        {
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
    					finish();
    		            Intent intent = new Intent().setClass(SplashActivity.this, MainActivity.class);
    		            startActivity(intent);
    				}
    				
    				
    				return null;
    			}
    	
    			@Override
    			protected void onPostExecute(Void v){
    				finish();
    	            Intent intent = new Intent().setClass(SplashActivity.this, Contests.class);
    	            startActivity(intent);
    			}
    		}
    		new LoginToServer().execute();
        	
        }
        else
        {
        	finish();
            Intent intent = new Intent().setClass(SplashActivity.this, MainActivity.class);
            startActivity(intent);
        }
        mHandler = new Handler();
       
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_splash, menu);
        return true;
    }
    

    
   

}
