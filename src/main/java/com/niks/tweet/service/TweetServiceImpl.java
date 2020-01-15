package com.niks.tweet.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niks.tweet.entity.Tweet;
import com.niks.tweet.repo.TweetRepo;

@Service
public class TweetServiceImpl implements TweetService {

	@Autowired
	TweetRepo repo;
	@Override
	public List<Tweet> getAllTweets() {
		
		return repo.findAll();
	}

	@Override
	public Optional<Tweet> getTweetsById(long u_id) {
		
		return repo.findById(u_id);
	}

}
