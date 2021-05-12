package com.muratkistan.hrms_service.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.muratkistan.hrms_service.business.abstracts.JobPositionsService;
import com.muratkistan.hrms_service.entities.concretes.JobPosition;

@RestController
@RequestMapping("/api/1.0/position")
public class JobPositionsController {
	@Autowired
	private JobPositionsService jobPositionsService;
	
	
	@GetMapping("/add")
	@ResponseBody
	public String addPosition() {
		
		JobPosition position1 = new JobPosition("Software Developer",10);
		JobPosition position2 = new JobPosition("Frontend Developer",5);
		JobPosition position3 = new JobPosition("Java Developer",7);
		
		jobPositionsService.addPosition(position1);
		jobPositionsService.addPosition(position2);
		jobPositionsService.addPosition(position3);
		
		
		
		return "Pozisyonlar  Eklendi";
		
	}
	
	
	@GetMapping("/delete/{id}")	//PathVariable ile buraya silinecek pozisyonun idsini giriyoruz
	@ResponseBody
	public String deletePosition(@PathVariable int  id) {
		
		jobPositionsService.deletePositionById(id);		
		return  "Silinen pozisyon id : "+ id;
		
	}
	
	@GetMapping("/getall")
	@ResponseBody
	public List<JobPosition> getAllPosition() {
		
		return jobPositionsService.getAllPosition();
		
	}

}
