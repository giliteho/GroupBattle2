package com.example.groupbattle2;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;


public class SettingsActivity extends Activity {

	final static int AUTHORIZE_ACTIVITY_RESULT_CODE = 0;
	Button backButton;
	LoginButton mLoginButton;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        String[] permissions = { "offline_access", "email", "user_photos", "user_birthday"};
        
        backButton = (Button)findViewById(R.id.back);
        mLoginButton = (LoginButton)findViewById(R.id.loginSettings);
        mLoginButton.init(this, AUTHORIZE_ACTIVITY_RESULT_CODE, Utility.mFacebook, permissions);
        
        backButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				finish();
				Intent i = new Intent(getApplicationContext(), Contests.class);
				startActivity(i);
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_settings, menu);
        return true;
        
       
        
    }
}
