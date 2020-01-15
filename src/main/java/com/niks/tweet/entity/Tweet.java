package com.niks.tweet.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tweet_details")
public class Tweet {

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private long id;
	private String tweet;
	public Tweet(long id, String tweet) {
		super();
		this.id = id;
		this.tweet = tweet;
	}
	
	public Tweet() {
		super();
	}

	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTweet() {
		return tweet;
	}
	public void setTweet(String tweet) {
		this.tweet = tweet;
	}
	
}
