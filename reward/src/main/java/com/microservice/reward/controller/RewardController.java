package com.microservice.reward.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.reward.model.Reward;
import com.microservice.reward.repo.RewardRepo;

@RestController
@RequestMapping("/reward")
public class RewardController {
	
	@Autowired
	RewardRepo rewardRepository;
	
	@RequestMapping(method=RequestMethod.POST)
	public Reward create(@RequestBody Reward reward) {
		rewardRepository.save(reward);
		return reward;
	}
	
	
	@RequestMapping(method=RequestMethod.GET, value="{rewardId}")
	public Reward get(@PathVariable String rewardId) {
		return rewardRepository.findOne(rewardId);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/")
	public  List<Reward> getAll(){
		return rewardRepository.findAll();
	}
	
	
	
	
	

}
