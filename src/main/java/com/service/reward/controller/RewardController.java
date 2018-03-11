package com.service.reward.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.service.reward.model.Reward;
import com.service.reward.repo.RewardRepo;

@RestController
@RequestMapping("/reward")
public class RewardController {
	
	@Autowired
	RewardRepo rewardRepository;
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@RequestMapping(method=RequestMethod.POST)
	public Reward create(@RequestBody Reward reward) {
		rewardRepository.save(reward);
		return reward;
	}
	
	
	@RequestMapping(method=RequestMethod.GET, value="{rewardId}")
	public Optional<Reward> get(@PathVariable String rewardId) {
		return rewardRepository.findById(rewardId);
	}
	
	@RequestMapping(method=RequestMethod.GET,value="/")
	public  List<Reward> getAll(){
		return rewardRepository.findAll();
	}
	
	@RequestMapping("/service-instances/{applicationName}")
	public List<ServiceInstance> serviceInstancesByApplicationName(@PathVariable String applicationName){
		
		return this.discoveryClient.getInstances(applicationName);
	}
	
	
	
	
	

}
