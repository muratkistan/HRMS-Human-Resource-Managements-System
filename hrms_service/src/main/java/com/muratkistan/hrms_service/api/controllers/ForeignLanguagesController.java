package com.muratkistan.hrms_service.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.muratkistan.hrms_service.business.abstracts.ForeignLanguageService;
import com.muratkistan.hrms_service.core.utilities.result.DataResult;
import com.muratkistan.hrms_service.entities.concretes.ForeignLanguage;

@RestController
@RequestMapping("/api/1.0/foreignlanguage")
public class ForeignLanguagesController {
	
	private ForeignLanguageService foreignLanguageService;
	
	
	
	@Autowired
	public ForeignLanguagesController(ForeignLanguageService foreignLanguageService) {
		super();
		this.foreignLanguageService = foreignLanguageService;
	}

	@PostMapping("/add")
    public ResponseEntity<DataResult<ForeignLanguage>> add(@RequestBody ForeignLanguage foreignLanguage){
        return foreignLanguageService.add(foreignLanguage);
    }

    @GetMapping("/getall")
    public ResponseEntity<DataResult<List<ForeignLanguage>>> getAll(){
        return foreignLanguageService.getAll();
    }
    
    @GetMapping("/findAllByJobSeekerId")
    public ResponseEntity<?> findAllByJobSeekerId(int jobSeekerId){
    	return ResponseEntity.ok(foreignLanguageService.findAllByJobSeekerId(jobSeekerId));
    }

}
