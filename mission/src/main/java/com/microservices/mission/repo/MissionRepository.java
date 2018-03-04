package com.microservices.mission.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.microservices.mission.model.Mission;

public interface MissionRepository extends MongoRepository<Mission, String> {

}
