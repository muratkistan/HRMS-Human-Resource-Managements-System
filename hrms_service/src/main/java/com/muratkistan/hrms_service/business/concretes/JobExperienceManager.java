package com.muratkistan.hrms_service.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.muratkistan.hrms_service.business.abstracts.JobExperienceService;
import com.muratkistan.hrms_service.core.utilities.result.DataResult;
import com.muratkistan.hrms_service.core.utilities.result.SuccessDataResult;
import com.muratkistan.hrms_service.dataAccess.abstracts.JobExperienceDao;
import com.muratkistan.hrms_service.entities.concretes.JobExperience;

@Service
public class JobExperienceManager implements JobExperienceService {
	
	
	private JobExperienceDao jobExperienceDao;

	
	@Autowired
	public JobExperienceManager(JobExperienceDao jobExperienceDao) {
		super();
		this.jobExperienceDao = jobExperienceDao;
	}

	@Override
	public ResponseEntity<DataResult<JobExperience>> add(JobExperience jobExperience) {
		return ResponseEntity.ok(new SuccessDataResult<>(jobExperienceDao.save(jobExperience)));
	}

	@Override
	public ResponseEntity<DataResult<List<JobExperience>>> getAll() {
		return ResponseEntity.ok(new SuccessDataResult<>(jobExperienceDao.findAll()));
	}

	@Override
	public ResponseEntity<DataResult<List<JobExperience>>> findAllByOrderByLeavingDateAsc() {
		
		return ResponseEntity.ok(new SuccessDataResult<>(jobExperienceDao.findAllByOrderByLeavingDateAsc()));
	}

	@Override
	public ResponseEntity<DataResult<List<JobExperience>>> getAllByJobSeekerIdOrderByLeavingDateDesc(int jobSeekerId) {
		
		return ResponseEntity.ok(new SuccessDataResult<>(jobExperienceDao.getAllByJobSeekerIdOrderByLeavingDateDesc(jobSeekerId)));
	}

	@Override
	public DataResult<List<JobExperience>> findAllByJobSeekerId(int jobSeekerId) {

		return new SuccessDataResult<List<JobExperience>>(jobExperienceDao.findAllByJobSeekerId(jobSeekerId));
	}

}
