package com.microservice.reward.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microservice.reward.model.Reward;

public interface RewardRepo extends MongoRepository<Reward, String> {
	
	

}
