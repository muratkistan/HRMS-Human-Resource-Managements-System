package com.muratkistan.hrms_service.api.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muratkistan.hrms_service.business.abstracts.EducationService;
import com.muratkistan.hrms_service.core.utilities.result.DataResult;
import com.muratkistan.hrms_service.entities.concretes.Education;

@RestController
@RequestMapping("/api/1.0/education")
public class EducationsController {
	
	private EducationService educationService;

	public EducationsController(EducationService educationService) {
		super();
		this.educationService = educationService;
	}
	
	@PostMapping("/add")
    public ResponseEntity<DataResult<Education>> add(@RequestBody Education education){
        return educationService.add(education);
    }

    @GetMapping("/getall")
    public ResponseEntity<DataResult<List<Education>>> getAll(){
        return educationService.getAll();
    }
    
    @GetMapping("/findAllByJobSeekerId/{jobSeekerId}")
    public ResponseEntity<?> findAllByJobSeekerId(@PathVariable int jobSeekerId){
    	return ResponseEntity.ok(educationService.findAllByJobSeekerId(jobSeekerId));
    }
	

}
