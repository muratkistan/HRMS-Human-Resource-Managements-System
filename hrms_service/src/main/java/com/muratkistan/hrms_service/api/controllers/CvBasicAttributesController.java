package com.muratkistan.hrms_service.api.controllers;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muratkistan.hrms_service.business.abstracts.CvBasicAttributeService;
import com.muratkistan.hrms_service.core.utilities.result.DataResult;
import com.muratkistan.hrms_service.entities.concretes.CvBasicAttribute;

@RestController
@RequestMapping("/api/1.0/cVBasicAttribute")
public class CvBasicAttributesController {
	
	private CvBasicAttributeService cvBasicAttributeService;

	public CvBasicAttributesController(CvBasicAttributeService cvBasicAttributeService) {
		super();
		this.cvBasicAttributeService = cvBasicAttributeService;
	}
	
	 @PostMapping("/add")
	    public ResponseEntity<DataResult<CvBasicAttribute>> add(@RequestBody CvBasicAttribute cvBasicAttribute){
	        return cvBasicAttributeService.add(cvBasicAttribute);
	    }

	    @GetMapping( "/getall")
	    public ResponseEntity<DataResult<List<CvBasicAttribute>>> getAll(){
	        return cvBasicAttributeService.getAll();
	    }
	    
	    @GetMapping( "/findAllByJobSeekerId/{jobSeekerId}")
	    public ResponseEntity<?> findAllByJobSeekerId(@PathVariable int jobSeekerId) {
	    	return ResponseEntity.ok(cvBasicAttributeService.findAllByJobSeekerId(jobSeekerId));
	    }
	

}
