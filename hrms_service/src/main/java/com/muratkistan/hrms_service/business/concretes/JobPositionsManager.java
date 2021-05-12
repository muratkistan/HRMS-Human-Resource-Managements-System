package com.muratkistan.hrms_service.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muratkistan.hrms_service.business.abstracts.JobPositionsService;
import com.muratkistan.hrms_service.dataAccess.abstracts.JobPositionDao;
import com.muratkistan.hrms_service.entities.concretes.JobPosition;

@Service
public class JobPositionsManager implements JobPositionsService {

	private JobPositionDao jobPositionDao;
	
	@Autowired
	public JobPositionsManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}


	@Override
	public void addPosition(JobPosition jobPosition) {
		jobPositionDao.save(jobPosition);
		
		
	}



	@Override
	public void deletePositionById(int id ) {
		jobPositionDao.deleteById(id);
		
	}


	@Override
	public List<JobPosition> getAllPosition() {
		
		return jobPositionDao.findAll();
	}

}
