package me.mickerd.tccore.commands;

import twitter4j.Twitter;
import twitter4j.TwitterFactory;
import twitter4j.conf.ConfigurationBuilder;

public class TweetAPI {
	public Twitter createConfig(){
		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setDebugEnabled(true)
		  .setOAuthConsumerKey("*********************")
		  .setOAuthConsumerSecret("******************************************")
		  .setOAuthAccessToken("**************************************************")
		  .setOAuthAccessTokenSecret("******************************************");
		TwitterFactory tf = new TwitterFactory(cb.build());
		Twitter twitter = tf.getInstance();
	}
	public TweetAPI(){
		
	}

}
