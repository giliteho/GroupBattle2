package com.example.groupbattle2;

import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.tempuri.Answer;
import org.tempuri.Question;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;
import android.os.AsyncTask;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.Intent;
import android.view.Gravity;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class QuestionsActivity extends Activity {

	ProgressDialog progressDialog;
	ProgressBar progressTimer;
	TextView txtTimer;
	TextView textQuestion;
	Button btnAnswer1;
	Button btnAnswer2;
	Button btnAnswer3;
	Button btnAnswer4;
	Button btnBack;
	List<Answer> answers;
	Question currentQuestion;
	Question nextQuestion;
	boolean nextQuestionReady = false;
	boolean showQuestion = false;
	CountDownTimer timer;
	MediaPlayer mp;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        
        textQuestion = (TextView)findViewById(R.id.question);
    	btnAnswer1 = (Button)findViewById(R.id.answer1);
    	btnAnswer2 = (Button)findViewById(R.id.answer2);
    	btnAnswer3 = (Button)findViewById(R.id.answer3);
    	btnAnswer4 = (Button)findViewById(R.id.answer4);
    	btnBack = (Button)findViewById(R.id.back);
    	progressTimer = (ProgressBar)findViewById(R.id.progressBarTimer);
    	txtTimer = (TextView)findViewById(R.id.txtTimer);
    	
    	
    	btnAnswer1.setText("");
    	btnAnswer2.setText("");
    	btnAnswer3.setText("");
    	btnAnswer4.setText("");
    	
    	timer = new CountDownTimer(30000,1000) {
			
			@Override
			public void onTick(long millisUntilFinished) {
				if(millisUntilFinished < 10000)
				{
					// color - red
				
				}
				else if(millisUntilFinished >= 10000 && millisUntilFinished < 20000)
				{
					
				}
				else
				{
					
				}
				int sec = (int) Math.floor(millisUntilFinished / 1000);
				txtTimer.setText(String.valueOf(sec));
				
				playSound(R.raw.tick);
			}
			
			@Override
			public void onFinish() {
				setAnswer(0, false, true);		
			}
		};
    	
    	btnAnswer1.setOnClickListener(new OnClickListener() {		
			@Override
			public void onClick(View v) {
				Answer a = (Answer)btnAnswer1.getTag();
				setAnswer(a.getAnswerId(), a.isIsCorrect(),false);
			}
		});
    	btnAnswer2.setOnClickListener(new OnClickListener() {		
			@Override
			public void onClick(View v) {
				Answer a = (Answer)btnAnswer2.getTag();
				setAnswer(a.getAnswerId(), a.isIsCorrect(),false);
			}
		});
    	btnAnswer3.setOnClickListener(new OnClickListener() {		
			@Override
			public void onClick(View v) {
				Answer a = (Answer)btnAnswer3.getTag();
				setAnswer(a.getAnswerId(), a.isIsCorrect(),false);
			}
		});
    	btnAnswer4.setOnClickListener(new OnClickListener() {		
			@Override
			public void onClick(View v) {
				Answer a = (Answer)btnAnswer4.getTag();
				setAnswer(a.getAnswerId(), a.isIsCorrect(),false);
			}
		});
    
    	btnBack.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), Contests.class);
  				startActivity(i);
			}
		});
    	showQuestion = true;
    	progressDialog = ProgressDialog.show(QuestionsActivity.this,"", "Get Ready!");
        loadNewQuestion();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_questions, menu);
        return true;
    }

    void loadNewQuestion()
    {
    	final class GetQuestionTask extends AsyncTask<Void, Void, Question>
    	{

			@Override
			protected Question doInBackground(Void... arg0) {
				Question resp = ServerManager.GetContestQuestion();
				if(resp == null)
				{
					Utility.Assert("loadNewQuestion: server returned null");
					return new Question();
				}
				return resp;
			}
			@Override
			protected void onPostExecute(Question result) {
				if(progressDialog.isShowing())
				{
					progressDialog.dismiss();
				}
				if(showQuestion)
				{
					applyQuestion(result);
					loadNewQuestion();
					showQuestion = false;
				}
				else
				{
					nextQuestion = result;
					nextQuestionReady = true;
				}
				
				
				super.onPostExecute(result);
			}
    		
    	}
    	
    	
    	new GetQuestionTask().execute();
    	
    }
    
    void applyQuestion(Question question)
    {
    	answers = question.getAnswers().getAnswer();
		textQuestion.setText(question.getQuestionText());
		
		btnAnswer1.setText(answers.get(0).getAnswerText());
		btnAnswer1.setTag(answers.get(0));
		
		btnAnswer2.setText(answers.get(1).getAnswerText());
		btnAnswer2.setTag(answers.get(1));
		
		btnAnswer3.setText(answers.get(2).getAnswerText());
		btnAnswer3.setTag(answers.get(2));
		
		btnAnswer4.setText(answers.get(3).getAnswerText());
		btnAnswer4.setTag(answers.get(3));
		
		
		currentQuestion = question;
		timer.start();
    }
    
    void playSound(int resid)
    {
    	mp = MediaPlayer.create(getApplicationContext(),resid);
        mp.setOnCompletionListener(new OnCompletionListener() {

            @Override
            public void onCompletion(MediaPlayer mp) {
                // TODO Auto-generated method stub
                mp.release();
            }

        });   
        mp.start();
    }
    void setAnswer(final int answer, boolean correct, boolean outOfTime)
    {
    	final class ReportAnswerTask extends AsyncTask<Void, Void, Void>
    	{

			@Override
			protected Void doInBackground(Void... params) {
				ServerManager.SetAnswer(currentQuestion.getQuestionId(), answer);
				return null;
			}
			@Override
			protected void onPostExecute(Void result) {
				super.onPostExecute(result);
			}
    	}
    	
    	timer.cancel();
    	
    	new ReportAnswerTask().execute();
    	
    	AlertDialog.Builder builder = new AlertDialog.Builder(this);
    	if(outOfTime)
    	{
    		builder.setMessage("Out of time!!");
    		playSound(R.raw.wrong);
    	}
    	else if(correct)
    	{
    		builder.setMessage("Correct!!");
    		playSound(R.raw.correct);
    	}
    	else
    	{
    		builder.setMessage("Nice try...");
    		playSound(R.raw.wrong);
    	}
    	
    	final AlertDialog dialog = builder.show();
    	// Must call show() prior to fetching text view
		TextView messageView = (TextView)dialog.findViewById(android.R.id.message);
		messageView.setGravity(Gravity.CENTER);
    	CountDownTimer timer =  new CountDownTimer(2000,1000) {
			
			@Override
			public void onTick(long millisUntilFinished) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void onFinish() {
				dialog.dismiss();
				
				
				if(nextQuestionReady)
				{
					applyQuestion(nextQuestion);
					nextQuestionReady = false;
					loadNewQuestion();
				}
				else
				{
					showQuestion = true;
					progressDialog = ProgressDialog.show(QuestionsActivity.this,"", "Get Ready!");
				}
			}
		};
    	
		timer.start();
    }
    

}


