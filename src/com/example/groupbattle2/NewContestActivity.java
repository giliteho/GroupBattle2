package com.example.groupbattle2;

import org.jinouts.xml.ws.AsyncHandler;
import org.tempuri.ArrayOfContest;

import android.os.AsyncTask;
import android.os.Bundle;
import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import android.widget.Spinner;
import android.widget.TextView;

public class NewContestActivity extends Activity {

	Button cancel;
	Button create;
	TextView textDuration;
	SeekBar seekDuration;
	EditText groupA;
	EditText groupB;
	Spinner topic;
	ProgressDialog progressDialog;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_contest);
        
        cancel = (Button) findViewById(R.id.buttonCancel);
        create = (Button) findViewById(R.id.buttonCreate);
        textDuration = (TextView) findViewById(R.id.seekText);
        seekDuration = (SeekBar) findViewById(R.id.seekBar);
        groupA = (EditText)findViewById(R.id.editText1);
        groupB = (EditText)findViewById(R.id.editText2);
        topic = (Spinner)findViewById(R.id.spinnerTopic);
        
        cancel.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), Contests.class);
				startActivity(i);
				
			}});
        
        
        seekDuration.setMax(ContestDurations.values().length -1);
        
        seekDuration.setOnSeekBarChangeListener(new OnSeekBarChangeListener() {
			
						
			@Override
			public void onProgressChanged(SeekBar seekBar, int progress,
					boolean fromUser) {
				
				textDuration.setText(ContestDurations.values()[progress].toString());
				
			}

			@Override
			public void onStartTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void onStopTrackingTouch(SeekBar seekBar) {
				// TODO Auto-generated method stub
				
			}
		});
        
        seekDuration.setProgress(1);
        
        create.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				
				class CreateNewTask extends AsyncTask<Void, Void, Void>
				{

					@Override
					protected Void doInBackground(Void... params) {
						
						int duration;
						switch(ContestDurations.values()[seekDuration.getProgress()])
						{
						case ONE_DAY:
							duration = 24;
							break;
						case ONE_HOUR:
							duration = 1;
							break;
						case ONE_MONTH:
							duration = 24 * 30;
							break;
						case ONE_WEEK:
							duration = 24 * 7;
							break;
						case TWO_DAYS:
							duration = 24 * 2;
							break;
						case TWO_WEEKS:
							duration = 24 * 14;
							break;
						default:
							duration = 1;
							break;
        	
						}
						
						ServerManager.CreateNewContest(groupA.getText().toString(), groupB.getText().toString(),topic.getSelectedItemPosition(), duration);
						
						return null;
					}
					@Override
					protected void onPostExecute(Void resp){
						progressDialog.dismiss();
						Intent i = new Intent(getApplicationContext(), Contests.class);
						startActivity(i);
					}
				
					
					
				}
				
				progressDialog = ProgressDialog.show(NewContestActivity.this,"", "Creating new contest...");
				new CreateNewTask().execute();

			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_new_contest, menu);
        return true;
    }
}
