package com.niks.tweet.service;

import java.util.List;
import java.util.Optional;

import com.niks.tweet.entity.Tweet;

public interface TweetService {

	List<Tweet> getAllTweets();

	Optional<Tweet> getTweetsById(long u_id);

}
