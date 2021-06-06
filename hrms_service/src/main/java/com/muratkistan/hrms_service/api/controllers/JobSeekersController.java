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

import com.muratkistan.hrms_service.business.abstracts.JobSeekerService;
import com.muratkistan.hrms_service.core.utilities.result.DataResult;
import com.muratkistan.hrms_service.core.utilities.result.Result;
import com.muratkistan.hrms_service.entities.concretes.JobSeeker;
import com.muratkistan.hrms_service.entities.dtos.JobSeekerCvDto;

@RestController
@RequestMapping("/api/1.0/jobseeker")
public class JobSeekersController {
	
	private JobSeekerService jobSeekerService;

	@Autowired
	public JobSeekersController(JobSeekerService jobSeekerService) {
		super();
		this.jobSeekerService = jobSeekerService;
	}
	

	@GetMapping("/getall")
	public DataResult<List<JobSeeker>> getAll(){
		return this.jobSeekerService.getAll();
		
	}
	
	@PostMapping("/add")
	public Result addJobSeeker(@RequestBody JobSeeker jobSeeker) {
		return this.jobSeekerService.addJobSeeker(jobSeeker);
	}
	
	
	@GetMapping("/getCVByJobSeekerId/{jobSeekerId}")
	ResponseEntity<?> getCVByJobSeekerId(@PathVariable int jobSeekerId){
		return ResponseEntity.ok(jobSeekerService.getCVByJobSeekerId(jobSeekerId));
	}
		
	
	

}
