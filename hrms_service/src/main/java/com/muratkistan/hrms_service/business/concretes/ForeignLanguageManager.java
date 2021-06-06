package com.muratkistan.hrms_service.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.muratkistan.hrms_service.business.abstracts.ForeignLanguageService;
import com.muratkistan.hrms_service.core.utilities.result.DataResult;
import com.muratkistan.hrms_service.core.utilities.result.SuccessDataResult;
import com.muratkistan.hrms_service.dataAccess.abstracts.ForeignLanguageDao;
import com.muratkistan.hrms_service.entities.concretes.ForeignLanguage;
import com.muratkistan.hrms_service.entities.concretes.JobExperience;

@Service
public class ForeignLanguageManager  implements ForeignLanguageService{
	
	private ForeignLanguageDao foreignLanguageDao;
	
	
	@Autowired
	public ForeignLanguageManager(ForeignLanguageDao foreignLanguageDao) {
		super();
		this.foreignLanguageDao = foreignLanguageDao;
	}

	@Override
	public ResponseEntity<DataResult<ForeignLanguage>> add(ForeignLanguage foreignLanguage) {
		
		return ResponseEntity.ok(new SuccessDataResult<>(foreignLanguageDao.save(foreignLanguage)));
	}

	@Override
	public ResponseEntity<DataResult<List<ForeignLanguage>>> getAll() {
		return ResponseEntity.ok(new SuccessDataResult<>(foreignLanguageDao.findAll()));
	}

	@Override
	public DataResult<List<ForeignLanguage>> findAllByJobSeekerId(int jobSeekerId) {
				return new SuccessDataResult<List<ForeignLanguage>>(this.foreignLanguageDao.findAllByJobSeekerId(jobSeekerId));
	}

	

}
