package de.gloresoft.workorderapi.services;

import java.util.List;

import de.gloresoft.workorderapi.entities.JobPost;

public interface JobPostService {

    Iterable<JobPost> findAllOrders();

    JobPost findById(Long id);

      

}
