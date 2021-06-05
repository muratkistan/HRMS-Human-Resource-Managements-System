package com.muratkistan.hrms_service.business.abstracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.muratkistan.hrms_service.core.utilities.result.DataResult;
import com.muratkistan.hrms_service.entities.concretes.ForeignLanguage;
import com.muratkistan.hrms_service.entities.concretes.JobExperience;

public interface ForeignLanguageService {
	
	ResponseEntity<DataResult<ForeignLanguage>> add(ForeignLanguage foreignLanguage);

	ResponseEntity<DataResult<List<ForeignLanguage>>> getAll();
	
	List<ForeignLanguage> findAllByJobSeekerId(int jobSeekerId);
	
	

}
