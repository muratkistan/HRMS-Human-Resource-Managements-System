package com.muratkistan.hrms_service.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muratkistan.hrms_service.business.abstracts.JobPositionsService;
import com.muratkistan.hrms_service.core.utilities.result.DataResult;
import com.muratkistan.hrms_service.core.utilities.result.Result;
import com.muratkistan.hrms_service.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/1.0/position")
public class JobPositionsController {

	private JobPositionsService jobPositionsService;
	
	
	
	@Autowired
	public JobPositionsController(JobPositionsService jobPositionsService) {
		super();
		this.jobPositionsService = jobPositionsService;
	}


	@PostMapping("/add")
	public Result addPosition(@RequestBody JobPosition jobPosition) {
		return jobPositionsService.addPosition(jobPosition);
		
	}
	
	@GetMapping("/getall")
	public DataResult<List<JobPosition>> getAll() {
		return jobPositionsService.getAll();	
		
	}

}
