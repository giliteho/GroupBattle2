package com.example.groupbattle2;
import java.util.List;

import org.tempuri.Contest;
import org.tempuri.WebService1;
import org.tempuri.WebService1Soap;

import android.graphics.Bitmap;
import android.util.Log;

import com.facebook.android.AsyncFacebookRunner;
import com.facebook.android.Facebook;


public class Utility {
	
	
	public static Facebook mFacebook;
	public static AsyncFacebookRunner mAsyncRunner;
	
	public static WebService1 mService = new WebService1 ( );
	public static WebService1Soap mSoap = mService.getWebService1Soap();
	public static int mUserID = 0;
	public static int mCurrentContestID;
	public static String userName = null;
	public static String mFacebookUserID = null;
	public static List<Contest> mMyContests;
	public static List<Contest> mFriendsContest;
	public static List<Contest> mPopularContest;
	public static Bitmap mUserPhoto = null;
	
	

	public static void Assert(String message)
	{
		Log.wtf("error", "groupbattle Error: " + message);
		
	}
}
