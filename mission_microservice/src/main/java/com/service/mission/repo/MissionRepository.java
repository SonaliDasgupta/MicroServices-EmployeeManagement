package com.service.mission.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.service.mission.model.Mission;

public interface MissionRepository extends MongoRepository<Mission, String> {

}
