package de.gloresoft.workorderapi.controllers;

import de.gloresoft.workorderapi.entities.JobPost;
import de.gloresoft.workorderapi.entities.WorkOrder;
import de.gloresoft.workorderapi.exceptions.ResourceNotFoundException;
import de.gloresoft.workorderapi.repositories.JobPostRepositoryMongo;
import de.gloresoft.workorderapi.services.JobPostService;
import de.gloresoft.workorderapi.services.WorkOrderService;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

import org.bson.Document;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@CrossOrigin(origins = "${workorders.gui.application.url}")
public class WorkOrderController {
	
	@Autowired
	JobPostRepositoryMongo  repo;
	@Autowired
	MongoTemplate mongoTemplate;
	//@Bean 
//	 public RestTemplate restTemplate() {
		// return new RestTemplate(); }
   // private final WorkOrderService workOrderService;
   
  //  private final JobPostService jobPostService;
   // 
    //public WorkOrderController(JobPostService jobPostService) {
	//	this.jobPostService = jobPostService;
  //  }
  
//job post mapping 
    @GetMapping(path = "/jobpost", produces = "application/json")
    public Iterable<JobPost> getAllJobPost() {
    	//System.out.println(repo.findAll().size());
    	//System.out.println(repo.findAll());
       // return repo.findAll();
    	//mongoTemplate.find();
    	return null;
    }

   @PostMapping(path = "/jobpostcreate", produces = "application/json")
public JobPost addJobPost(@RequestBody String jobPost) {
	   Document doc=Document.parse(jobPost);
	   mongoTemplate.insert(doc,"jobpost");
	   //return repo.save(jobPost);
	   return null;
   }
   

}
