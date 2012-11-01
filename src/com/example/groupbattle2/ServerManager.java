package com.example.groupbattle2;


import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

import org.json.JSONObject;
import org.tempuri.ArrayOfContest;
import org.tempuri.BasicResponse;
import org.tempuri.Contest;
import org.tempuri.ErrorCodes;
import org.tempuri.Question;

import com.example.groupbattle2.MainActivity.FlushedInputStream;

import android.graphics.BitmapFactory;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

public class ServerManager {
	
	public static boolean LoginToServer()
	{
		Bundle bundle = new Bundle();
        bundle.putString("fields", "picture, name");
        
        String s = Utility.mFacebook.getAccessToken();
        
        
        try {
        	// request me object
			String response = Utility.mFacebook.request("me", bundle);
		
			
			
			
			//parse me object
			JSONObject jsonObject = new JSONObject(response);
			
            
            final String name = jsonObject.getString("name");
            Utility.mFacebookUserID = jsonObject.getString("id");
            Utility.userName = name;
            final String picURL = jsonObject.getString("picture");
            //download user picture
            /*URL aURL= new URL(picURL);
			URLConnection conn = aURL.openConnection();
            conn.connect();
            InputStream is = conn.getInputStream();
            BufferedInputStream bis = new BufferedInputStream(is);
            Utility.mUserPhoto = BitmapFactory.decodeStream(new FlushedInputStream(is));
            bis.close();
            is.close();*/
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 
		int userID = ServerManager.IsUserExist();
		
		if(userID == -1)
		{
			Utility.mUserID = ServerManager.AddFacebookUser();
			
		}
		else
		{
			Utility.mUserID = userID;
		}
		ServerManager.RenewAccessToken();
		return true;
	}
	
	public static void RenewAccessToken()
	{
		BasicResponse resp = Utility.mSoap.renewFacebookAccessToken(Utility.mUserID, Utility.mFacebook.getAccessToken());
		if(ErrorCodes.values()[resp.getErrorCodeAsInt()] != ErrorCodes.SUCCESS)
		{
			Utility.Assert("RenewAccessToken");
		}
		
		
	}
	
	public static int AddFacebookUser()
	{
		BasicResponse resp = Utility.mSoap.addFacebookUser(Utility.mFacebook.getAccessToken());
		if(ErrorCodes.values()[resp.getErrorCodeAsInt()] != ErrorCodes.SUCCESS)
		{
			Utility.Assert("AddFacebookUser");
		}
		return resp.getParam();
	}
	
	public static Question GetContestQuestion()
	{
		Question resp = Utility.mSoap.getContestQuestion(Utility.mUserID, Utility.mCurrentContestID);
		return resp;
	}
	
	public static void SetAnswer(int questionID, int answerID)
	{
		BasicResponse resp = Utility.mSoap.setAnswer(Utility.mUserID, Utility.mCurrentContestID, questionID, answerID);
		if(ErrorCodes.values()[resp.getErrorCodeAsInt()] != ErrorCodes.SUCCESS)
		{
			Utility.Assert("SetAnswer");
		}
	}
	
	public static void AddFacebookUserAsync()
	{
		final class AddFacebookUserTask extends AsyncTask<Void, Void, BasicResponse>
		{

			@Override
			protected BasicResponse doInBackground ( Void... params ){
				// Here Call the Web service, The simplest way
				BasicResponse resp = Utility.mSoap.addFacebookUser(Utility.mFacebook.getAccessToken());
				
				return resp;
			}
	
			@Override
			protected void onPostExecute(BasicResponse resp){
				if ( resp != null )
				{
					Log.i (  "AndroidWSAppActivity ", "Success Code From Resp !!!!!!: "+ resp.getParam());
					Utility.mUserID = resp.getParam();
				}
			}
		}
		new AddFacebookUserTask().execute();
	}
	
	public static void AddUserToContestAsync(final int contestID, final int itemID)
	{
		final class AddUserToContestTask extends AsyncTask<Void, Void, BasicResponse>
		{

			@Override
			protected BasicResponse doInBackground ( Void... params ){
				// Here Call the Web service, The simplest way
				BasicResponse resp = Utility.mSoap.addUserToContest(Utility.mUserID, contestID, itemID);
				return resp;
			}
	
			@Override
			protected void onPostExecute(BasicResponse resp){
				if ( resp != null )
				{
					if(ErrorCodes.values()[resp.getErrorCodeAsInt()] != ErrorCodes.SUCCESS)
					{
						Utility.Assert("IsUserExistAsync");
					}
				}
			}
		}
		new AddUserToContestTask().execute();
	}
	
	public static int IsUserExist()
	{
		BasicResponse resp = Utility.mSoap.isUserExists(Utility.mFacebookUserID, null);
		ErrorCodes t = resp.getErrorCode();
		if(ErrorCodes.values()[resp.getErrorCodeAsInt()] == ErrorCodes.NOT_EXISTS)
			return -1;
		else if(ErrorCodes.values()[resp.getErrorCodeAsInt()] != ErrorCodes.SUCCESS)
		{
			Utility.Assert("IsUserExist");
		}
		return resp.getParam();
		
		
		
	}
	public static boolean IsUserExistAsync()
	{
		final class IsUserExistTask extends AsyncTask<Void, Void, BasicResponse>
		{
			@Override
			protected BasicResponse doInBackground ( Void... params ){
				BasicResponse resp = Utility.mSoap.isUserExists(Utility.mFacebookUserID, null);
				ErrorCodes t = resp.getErrorCode();
				int a = resp.getParam();
				return resp;
			}
	
			@Override
			protected void onPostExecute(BasicResponse resp){
				if ( resp != null ){
					if(ErrorCodes.values()[resp.getErrorCodeAsInt()] != ErrorCodes.SUCCESS)
					{
						Utility.Assert("IsUserExistAsync");
					}
					
					Utility.mUserID = resp.getParam();
				}
			}
		}
		//new IsUserExistTask().execute();
		BasicResponse resp = Utility.mSoap.isUserExists(Utility.mFacebookUserID, null);
		Utility.mUserID = resp.getParam();
		if(Utility.mUserID == 0) return false;
		else return true;
	}

	public static List<Contest> GetListOfUserContests()
	{
		ArrayOfContest resp = Utility.mSoap.getListOfUserContests(Utility.mUserID,0, 10);
		return resp.getContest();
	}
	public static void GetListOfUserContestsAsync()
	{
		final class GetListOfUserContestsTask extends AsyncTask<Void, Void, ArrayOfContest>
		{

			@Override
			protected ArrayOfContest doInBackground ( Void... params ){
				// Here Call the Web service, The simplest way
				ArrayOfContest resp = Utility.mSoap.getListOfUserContests(Utility.mUserID,0, 10);
				return resp;
			}
	
			@Override
			protected void onPostExecute(ArrayOfContest resp){
				if ( resp != null )
				{
					//Log.i (  "AndroidWSAppActivity ", "Success Code From Resp !!!!!!: "+ resp.getParam());
					Utility.mMyContests = resp.getContest();
					
				}
			}
		}
		new GetListOfUserContestsTask().execute();
	}
	
	
	public static List<Contest> GetListOfFriendsContests()
	{
		ArrayOfContest resp = Utility.mSoap.getListOfUserFriendsContests(Utility.mUserID,0, 10);
		return resp.getContest();
	}
	public static List<Contest> GetListOfGlobalContests()
	{
		ArrayOfContest resp = Utility.mSoap.getListOfGlobalContests(Utility.mUserID,0, 10);
		return resp.getContest();
	}
	public static void GetListOfGlobalContestsAsync()
	{
		final class GetListOfGlobalContestsTask extends AsyncTask<Void, Void, ArrayOfContest>
		{

			@Override
			protected ArrayOfContest doInBackground ( Void... params ){
				// Here Call the Web service, The simplest way
				ArrayOfContest resp = Utility.mSoap.getListOfGlobalContests(Utility.mUserID,0, 10);
				return resp;
			}
	
			@Override
			protected void onPostExecute(ArrayOfContest resp){
				if ( resp != null )
				{
					Utility.mPopularContest = resp.getContest();	
				}
			}
		}
		new GetListOfGlobalContestsTask().execute();
	}
	
	public static void GetContestLists()
	{
		ExecutorService executor = Executors.newCachedThreadPool();
		
		FutureTask<String> futureMe =
			       new FutureTask<String>(new Callable<String>() {
			         public String call() {
			        	Utility.mMyContests = ServerManager.GetListOfUserContests();
	        			return "";
			       }});
		FutureTask<String> futureFriends =
			       new FutureTask<String>(new Callable<String>() {
			         public String call() {
			        	Utility.mFriendsContest = ServerManager.GetListOfFriendsContests();
	        			return "";
			       }});
		
		FutureTask<String> futurePop =
			       new FutureTask<String>(new Callable<String>() {
			         public String call() {
	        			Utility.mPopularContest = ServerManager.GetListOfGlobalContests();
	        			return "";
			       }});
		executor.execute(futureMe);
		executor.execute(futureFriends);
		executor.execute(futurePop);
		
		try {
			futureMe.get();
			futureFriends.get();
			futurePop.get();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static void CreateNewContest(final String nameA, final String nameB, final int topicID,final int duration )
	{
		
		BasicResponse resp = Utility.mSoap.addNewContest(Utility.mUserID, nameA, nameB,"", topicID, duration);
		if(ErrorCodes.values()[resp.getErrorCodeAsInt()] != ErrorCodes.SUCCESS)
		{
			Utility.Assert("addNewContest");
		}
	}
}


