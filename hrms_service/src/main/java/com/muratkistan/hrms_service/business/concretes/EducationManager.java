package com.muratkistan.hrms_service.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.muratkistan.hrms_service.business.abstracts.EducationService;
import com.muratkistan.hrms_service.core.utilities.result.DataResult;
import com.muratkistan.hrms_service.core.utilities.result.SuccessDataResult;
import com.muratkistan.hrms_service.dataAccess.abstracts.EducationDao;
import com.muratkistan.hrms_service.entities.concretes.Education;

@Service
public class EducationManager implements EducationService {
	
	private EducationDao educationDao;

	@Autowired
	public EducationManager(EducationDao educationDao) {
		super();
		this.educationDao = educationDao;
	}

	@Override
	public ResponseEntity<DataResult<Education>> add(Education education) {
		return ResponseEntity.ok(new SuccessDataResult<>(educationDao.save(education)));
	}

	@Override
	public ResponseEntity<DataResult<List<Education>>> getAll() {
		return ResponseEntity.ok(new SuccessDataResult<>(educationDao.findAll()));

	}

	@Override
	public ResponseEntity<DataResult<List<Education>>> findAllByJobSeekerId(int jobSeekerId) {
		
		return ResponseEntity.ok(new SuccessDataResult<>(educationDao.findAllByJobSeekerId(jobSeekerId)));

	}

}
