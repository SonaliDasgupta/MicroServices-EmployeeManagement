package com.microservice.reward.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection="rewards")
public class Reward {
	
	@Id
	private String ID;
	
	private String name;
	private String description;
	private int pointCost;
	
	public String getID() {
		return ID;
	}
	
	public void setID(String ID) {
		this.ID=ID;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getPointCost() {
		return pointCost;
	}
	public void setPointCost(int pointCost) {
		this.pointCost = pointCost;
	}
	
	
	

}
