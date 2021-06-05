package com.muratkistan.hrms_service.entities.dtos;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.muratkistan.hrms_service.entities.concretes.CvBasicAttribute;
import com.muratkistan.hrms_service.entities.concretes.Education;
import com.muratkistan.hrms_service.entities.concretes.ForeignLanguage;
import com.muratkistan.hrms_service.entities.concretes.JobExperience;
import com.muratkistan.hrms_service.entities.concretes.JobSeeker;
import com.muratkistan.hrms_service.entities.concretes.Skill;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CvAllPartDto {
	
	@JsonIgnore
	private JobSeeker jobSeeker;
	
	private List<JobExperience> jobExperiences;
	
	private List<ForeignLanguage> foreignLanguages;
	
	private List<Education> educations;
	
	private List<Skill> skills;
	
	private List<CvBasicAttribute> cVBasicAttributes;

	
	

}
