package com.service.reward.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.service.reward.model.Reward;

public interface RewardRepo extends MongoRepository<Reward, String> {
	
	

}
