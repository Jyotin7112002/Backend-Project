package com.TRMS.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.TRMS.Model.Feedback;
import com.TRMS.Repository.FeedRepository;

@Service
public class FeedService {
	
	@Autowired
	private FeedRepository repo;
	
	public void addFeed(Feedback f) {
	    repo.save(f);

		
	}

}
