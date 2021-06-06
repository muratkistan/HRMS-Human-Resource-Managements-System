package com.muratkistan.hrms_service.business.abstracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.muratkistan.hrms_service.core.utilities.result.DataResult;
import com.muratkistan.hrms_service.entities.concretes.JobExperience;

public interface JobExperienceService {
	
	ResponseEntity<DataResult<JobExperience>> add(JobExperience jobExperience);

	ResponseEntity<DataResult<List<JobExperience>>> getAll();
	
	DataResult<List<JobExperience>> findAllByJobSeekerId(int jobSeekerId);
	
	ResponseEntity<DataResult<List<JobExperience>>> findAllByOrderByLeavingDateAsc();
	
	ResponseEntity<DataResult<List<JobExperience>>> getAllByJobSeekerIdOrderByLeavingDateDesc(int jobSeekerId);
	
	

}
