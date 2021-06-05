package com.muratkistan.hrms_service.business.abstracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.muratkistan.hrms_service.core.utilities.result.DataResult;
import com.muratkistan.hrms_service.entities.concretes.Education;

public interface EducationService {
	
	ResponseEntity<DataResult<Education>> add(Education education);

	ResponseEntity<DataResult<List<Education>>> getAll();
	
	ResponseEntity<DataResult<List<Education>>> findAllByJobSeekerId(int jobSeekerId);

}
