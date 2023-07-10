package de.gloresoft.workorderapi.repositories;

import java.util.Optional;

import org.bson.Document;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import de.gloresoft.workorderapi.entities.JobPost;

public interface JobPostRepositoryMongo extends MongoRepository<JobPost, String>{
	//public interface JobPostRepositoryMongo extends MongoRepository<String, String>{
	Optional<JobPost> findById(Long id);
	
}
