package com.muratkistan.hrms_service.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.muratkistan.hrms_service.business.abstracts.JobAdvertisementService;
import com.muratkistan.hrms_service.core.utilities.result.DataResult;
import com.muratkistan.hrms_service.core.utilities.result.Result;
import com.muratkistan.hrms_service.entities.concretes.JobAdvertisement;

@RestController
@RequestMapping("/api/1.0/jobadvertisement")
public class JobAdvertisementsController {
	
	private JobAdvertisementService jobAdvertisementService;

	@Autowired
	public JobAdvertisementsController(JobAdvertisementService jobAdvertisementService) {
		super();
		this.jobAdvertisementService = jobAdvertisementService;
	}
	
	
	@PostMapping("/add")
	@ResponseStatus(HttpStatus.CREATED)
	public Result addJobAdvertisment(@RequestBody JobAdvertisement jobAdvertisement) {
		 return this.jobAdvertisementService.addJobAdvertisment(jobAdvertisement);
		 
	}
	
	
	@GetMapping("/getall")
	public DataResult<List<JobAdvertisement>> getAll() {
		return this.jobAdvertisementService.getAll();
	}
	
	
	@GetMapping("/getByIsActive")
	public DataResult<List<JobAdvertisement>> getByIsActiveTrue() {
		return this.jobAdvertisementService.getByIsActiveTrue();
	}
	
	
	
	@GetMapping("/getByIsActiveTrueOrderByPublishDate")
	public DataResult<List<JobAdvertisement>> getByIsActiveTrueOrderByPublishDate(){
		return this.jobAdvertisementService.getByIsActiveTrueOrderByPublishDate();
	}
	
	
	
	@GetMapping("/getByIsActiveTrueAndEmployer_CompanyName")
	public DataResult<List<JobAdvertisement>> getByIsActiveTrueAndEmployer_CompanyName(String companyName){
		return this.jobAdvertisementService.getByIsActiveTrueAndEmployer_CompanyName(companyName);
	}
	
	
	
	@GetMapping("/getByEmployer_CompanyName")
	public DataResult<List<JobAdvertisement>> getByEmployer_CompanyName(String companyName) {
		return this.jobAdvertisementService.getByEmployer_CompanyName(companyName);
	}
	
	
	
	

}
