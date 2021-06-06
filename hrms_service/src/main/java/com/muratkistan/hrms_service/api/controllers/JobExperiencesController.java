package com.muratkistan.hrms_service.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muratkistan.hrms_service.business.abstracts.JobExperienceService;
import com.muratkistan.hrms_service.core.utilities.result.DataResult;
import com.muratkistan.hrms_service.entities.concretes.JobExperience;

@RestController
@RequestMapping("/api/1.0/jobexperience")
public class JobExperiencesController {
	
	private JobExperienceService jobExperienceService;

	@Autowired
	public JobExperiencesController(JobExperienceService jobExperienceService) {
		super();
		this.jobExperienceService = jobExperienceService;
	}
	
	@PostMapping("/add")
    public ResponseEntity<DataResult<JobExperience>> add(@RequestBody JobExperience jobExperience){
        return jobExperienceService.add(jobExperience);
    }

    @GetMapping("/getall")
    public ResponseEntity<DataResult<List<JobExperience>>> getAll(){
        return jobExperienceService.getAll();
    }
    
    @GetMapping("/findAllByOrderByLeavingDateAsc")
    public ResponseEntity<DataResult<List<JobExperience>>> findAllByOrderByLeavingDateAsc() {
    	
    	return jobExperienceService.findAllByOrderByLeavingDateAsc();
    }
    
    @GetMapping("/getAllByJobSeekerIdOrderByLeavingDateDesc/{jobSeekerId}")
    public ResponseEntity<DataResult<List<JobExperience>>> getAllByJobSeekerIdOrderByLeavingDateDesc(@PathVariable int  jobSeekerId){
    	
    	return jobExperienceService.getAllByJobSeekerIdOrderByLeavingDateDesc(jobSeekerId);
    	
    }
    
    @GetMapping("/findAllByJobSeekerId/{jobSeekerId}")
    public ResponseEntity<?> findAllByJobSeekerId(@PathVariable int jobSeekerId) {
    	return ResponseEntity.ok(jobExperienceService.findAllByJobSeekerId(jobSeekerId));
    }
		
    	
	 

}
