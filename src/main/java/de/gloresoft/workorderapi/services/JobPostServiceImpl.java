package de.gloresoft.workorderapi.services;

import de.gloresoft.workorderapi.entities.JobPost;
import de.gloresoft.workorderapi.exceptions.ResourceNotFoundException;
import de.gloresoft.workorderapi.repositories.JobPostRepositoryMongo;

public class JobPostServiceImpl implements JobPostService {
	private final JobPostRepositoryMongo jobPostRepositoryMongo;
	  public JobPostServiceImpl (JobPostRepositoryMongo jobPostRepositoryMongoObject) {
	        this.jobPostRepositoryMongo = jobPostRepositoryMongoObject;
	    }
	
	@Override
	public Iterable<JobPost> findAllOrders() {
		// TODO Auto-generated method stub
		return null;
		// return this.jobPostRepositoryMongo.findAll();
	}

	@Override
	public JobPost findById(Long id) {
		// TODO Auto-generated method stub
		 return this.jobPostRepositoryMongo.findById(id).orElseThrow(()-> new ResourceNotFoundException("This id:"+id+" does not exist."));
	}

}
