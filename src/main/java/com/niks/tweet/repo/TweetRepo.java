package com.niks.tweet.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.niks.tweet.entity.Tweet;

public interface TweetRepo extends JpaRepository<Tweet, Long> {

}
