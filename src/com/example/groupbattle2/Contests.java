package com.example.groupbattle2;

import java.util.Date;
import java.util.List;


import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.RelativeLayout;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;

import org.tempuri.ArrayOfContest;
import org.tempuri.Contest;
import org.tempuri.ContestItem;

public class Contests extends Activity {
	
	ListView mMyList = null;
	ListView mFriendList = null;
	ListView mPopList = null;
	Button settings;
	Button newContest;
	private TabHost tabHost;
	ProgressDialog progressDialog;


    
	
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contests);
        
        mMyList = (ListView) findViewById(R.id.listViewMine);
        mFriendList = (ListView) findViewById(R.id.listViewFriends);
        mPopList = (ListView) findViewById(R.id.listViewPopular);
        
        settings = (Button) findViewById(R.id.settings);
        newContest = (Button) findViewById(R.id.newcontest);
        tabHost = (TabHost) findViewById(R.id.tabhost);
    	tabHost.setup();
    	
    	TabSpec spec1=tabHost.newTabSpec("MINE");
    	spec1.setContent(R.id.listViewMine);
    	spec1.setIndicator("MINE");

    	TabSpec spec2=tabHost.newTabSpec("FRIENDS");
    	spec2.setIndicator("FRIENDS");
    	spec2.setContent(R.id.listViewFriends);

    	TabSpec spec3=tabHost.newTabSpec("POPULAR");
    	spec3.setIndicator("POPULAR");
    	spec3.setContent(R.id.listViewPopular);
    	
    	settings.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), SettingsActivity.class);
				startActivity(i);
				
			}
		});
    	
    	newContest.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent i = new Intent(getApplicationContext(), NewContestActivity.class);
				startActivity(i);
				
			}
		});

    	tabHost.addTab(spec1);
    	tabHost.addTab(spec2);
    	tabHost.addTab(spec3);
        
        
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.activity_contests, menu);
        return true;
    }
    
    @Override
    protected void onResume() {
    	final class GetListOfContestsTask extends AsyncTask<Void, Void, Void>
		{

			@Override
			protected Void doInBackground ( Void... params ){
				// Here Call the Web service, The simplest way
				ServerManager.GetContestLists();
				return null;
			}
	
			@Override
			protected void onPostExecute(Void v){
				populateLists();
				progressDialog.dismiss();
			}
		}
    	
    	progressDialog = ProgressDialog.show(Contests.this,"", "Loading contests...");
		new GetListOfContestsTask().execute();
    	super.onResume();
    }
    
    
    private void populateLists()
    {
    	if(Utility.mMyContests != null)
			mMyList.setAdapter(new ContestsAdapter(this, Utility.mMyContests));
		if(Utility.mFriendsContest != null)
			mFriendList.setAdapter(new ContestsAdapter(this, Utility.mFriendsContest));
		if(Utility.mPopularContest != null)
			mPopList.setAdapter(new ContestsAdapter(this,Utility.mPopularContest));
    }

    public class ContestsAdapter extends ArrayAdapter<Contest> {
    	  private final Context context;
    	  private List<Contest> values;
    	  private LayoutInflater inflater=null;

    	  public ContestsAdapter(Context context, List<Contest> values) {
    	    super(context, R.layout.activity_contests, values);
    	    this.context = context;
    	    this.values = values;
    	    inflater = ((Activity)context).getLayoutInflater();
    	  }

    	  @Override
    	  public View getView(final int position, View convertView, ViewGroup parent) {
    		  	View vi=convertView;
    		  	Contest contest = values.get(position);
		        if(convertView==null)
		        {
		        	vi = inflater.inflate(R.layout.list_row, parent,false);
		        }
		        TextView numOfPlayers = (TextView)vi.findViewById(R.id.numOfPlayers);
		        //TextView daysEnd = (TextView)vi.findViewById(R.id.ContestDays);
		        //TextView hrsEnd = (TextView)vi.findViewById(R.id.ContestHrs);
		        TextView leftPercentage = (TextView)vi.findViewById(R.id.percentageLeft);
		        TextView leftName = (TextView)vi.findViewById(R.id.GroupLeft);
		        TextView rightPercentage = (TextView)vi.findViewById(R.id.percentageRight);
		        TextView rightName = (TextView)vi.findViewById(R.id.GroupRight);
		        RelativeLayout left = (RelativeLayout)vi.findViewById(R.id.list_left);
		        RelativeLayout right = (RelativeLayout)vi.findViewById(R.id.list_right);
		        TextView joinLeft = (TextView)vi.findViewById(R.id.JoinLeft);
		        TextView joinRight = (TextView)vi.findViewById(R.id.JoinRight);
		        
		        switch(contest.getUserItemId())
		        {
		        	case 0:
		        		joinLeft.setText("JOIN");
		        		joinRight.setText("JOIN");
		        		left.setSelected(false);
		        		right.setSelected(false);
		        		break;
		        	case 1:
		        		joinLeft.setText("PLAY");
		        		joinRight.setText("JOIN");
		        		left.setSelected(true);
		        		right.setSelected(false);
			        	break;
		        	case 2:
		        		joinLeft.setText("JOIN");
		        		joinRight.setText("PLAY");
		        		right.setSelected(true);
		        		left.setSelected(false);
			        	break;
		        }
    	 
    	        left.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						onListItemClick(this, this, position, 1);
						
					}
				});
    	        right.setOnClickListener(new OnClickListener() {
					
					@Override
					public void onClick(View v) {
						onListItemClick(this, this, position, 2);
						
					}
				});
    	        
    	        numOfPlayers.setText(contest.getParticipants() + " Players");
    	        List<ContestItem> items = contest.getItems().getContestItem();
    	        
    	        Date end = new Date(contest.getEndTime()*1000);
    	        Date start = new Date(contest.getStartTime()*1000);
    	        
    	        long remaining = (end.getTime() - start.getTime()) / 1000;
    	        
    	        double days = Math.floor(remaining / (60*60*24));
    	        double hrs = Math.floor(remaining % (60*60*24)/(60*60));
    	        
    	        //Date remaining = new Date(end.getTime() - start.getTime());
    	        
    	        //hrsEnd.setText(String.valueOf((int)hrs));
    	        //daysEnd.setText(String.valueOf((int)days));
    	        
    	        
    	        if(items.size() == 2)
    	        {
    	        	leftName.setText(items.get(0).getName());
    	        	rightName.setText(items.get(1).getName());
    	        }
    	        
    	        return vi;
    	  }
    	  protected void onListItemClick(OnClickListener onClickListener,
                  OnClickListener onClickListener2, int position, Object object) {
    		  	Contest contest = values.get(position);
    		  	Utility.mCurrentContestID = contest.getContestId();
    		  	int itemID = (Integer)object;
    		  	
    		  	if(contest.getUserItemId() == 0)
    		  	{
    		  		ServerManager.AddUserToContestAsync(contest.getContestId(), itemID);
    		  	}
    		  	
  				Intent i = new Intent(Contests.this, QuestionsActivity.class);
  				startActivity(i);
    		  	
    		  
          }
    	}
}
