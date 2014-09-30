package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TweetListModel {
	private ArrayList<LonelyTweetModel> tweets;
	public TweetListModel(){
		super();
		this.tweets = new ArrayList<LonelyTweetModel>();
	}

	public void add(LonelyTweetModel t) {
		tweets.add(t);
	}
	
	public void remove(LonelyTweetModel t) {
		tweets.remove(t);
	}

	public boolean hasTweet(LonelyTweetModel t) {
		return tweets.contains(t);
	}
	
	public void addTweet(LonelyTweetModel t) throws MyException{
		if (hasTweet(t)){
			throw new MyException();
		}
		else{
			tweets.add(t);
		}
	}
	
	public ArrayList<LonelyTweetModel> getTweet(){
		Collections.sort(tweets, new Comparator<LonelyTweetModel>() {
	        public int compare(LonelyTweetModel  text1, LonelyTweetModel  text2)
	        {

	            return  text1.text.compareTo(text2.text);
	        }
	    });
		return tweets;
	}
	
	public int getCount(){
		return tweets.size();
	}
	
}