package com.muratkistan.hrms_service.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.muratkistan.hrms_service.business.abstracts.CvBasicAttributeService;
import com.muratkistan.hrms_service.core.utilities.result.DataResult;
import com.muratkistan.hrms_service.core.utilities.result.SuccessDataResult;
import com.muratkistan.hrms_service.dataAccess.abstracts.CvBasicAttributeDao;
import com.muratkistan.hrms_service.entities.concretes.CvBasicAttribute;

@Service
public class CvBasicAttributeManager implements CvBasicAttributeService {

	private CvBasicAttributeDao cvBasicAttributeDao;

	@Autowired
	public CvBasicAttributeManager(CvBasicAttributeDao cvBasicAttributeDao) {
		super();
		this.cvBasicAttributeDao = cvBasicAttributeDao;
	}

	@Override
	public ResponseEntity<DataResult<CvBasicAttribute>> add(CvBasicAttribute cvBasicAttribute) {
		return ResponseEntity.ok(new SuccessDataResult<>(cvBasicAttributeDao.save(cvBasicAttribute)));

	}

	@Override
	public ResponseEntity<DataResult<List<CvBasicAttribute>>> getAll() {
		return ResponseEntity.ok(new SuccessDataResult<>(cvBasicAttributeDao.findAll()));
	}

	@Override
	public ResponseEntity<DataResult<List<CvBasicAttribute>>> findAllByJobSeekerId(int jobSeekerId) {

		return ResponseEntity.ok(new SuccessDataResult<>(cvBasicAttributeDao.findAllByJobSeekerId(jobSeekerId)));
	}

}
