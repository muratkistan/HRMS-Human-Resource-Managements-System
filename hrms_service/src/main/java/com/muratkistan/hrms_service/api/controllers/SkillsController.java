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

import com.muratkistan.hrms_service.business.abstracts.SkillService;
import com.muratkistan.hrms_service.core.utilities.result.DataResult;
import com.muratkistan.hrms_service.entities.concretes.Skill;

@RestController
@RequestMapping("/api/1.0/skill")
public class SkillsController {
	
	private SkillService skillService;

	@Autowired
	public SkillsController(SkillService skillService) {
		super();
		this.skillService = skillService;
	}
	
	@PostMapping("/add")
    public ResponseEntity<DataResult<Skill>> add(@RequestBody Skill skill){
        return skillService.add(skill);
    }

    @GetMapping("/getall")
    public ResponseEntity<DataResult<List<Skill>>> getAll(){
        return skillService.getAll();
    }
    
    @GetMapping("/findAllByJobSeekerId/{jobSeekerId}")
    public ResponseEntity<DataResult<List<Skill>>> findAllByJobSeekerId(@PathVariable int jobSeekerId) {
    	return skillService.findAllByJobSeekerId(jobSeekerId);
    }
	

}
