package com.niks.tweet.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.niks.tweet.entity.Tweet;
import com.niks.tweet.service.TweetService;

@RestController
public class TweetController {
	
	@Autowired
	TweetService service;

	@GetMapping("/tweets")
	public List<Tweet> getAllTweets(){
		return service.getAllTweets();
	}
	
	@GetMapping("tweets/{u_id}")
	public Optional<Tweet> getTweetsById(@PathVariable("u_id") long u_id){
		return service.getTweetsById(u_id);
	}
}
