package com.muratkistan.hrms_service.business.concretes;

import java.util.List;

import org.springframework.stereotype.Service;

import com.muratkistan.hrms_service.business.abstracts.JobPositionsService;
import com.muratkistan.hrms_service.core.utilities.result.DataResult;
import com.muratkistan.hrms_service.core.utilities.result.ErrorResult;
import com.muratkistan.hrms_service.core.utilities.result.Result;
import com.muratkistan.hrms_service.core.utilities.result.SuccessDataResult;
import com.muratkistan.hrms_service.core.utilities.result.SuccessResult;
import com.muratkistan.hrms_service.dataAccess.abstracts.JobPositionDao;
import com.muratkistan.hrms_service.entities.concretes.JobPosition;

@Service
public class JobPositionsManager implements JobPositionsService {

	private JobPositionDao jobPositionDao;

	public JobPositionsManager(JobPositionDao jobPositionDao) {
		super();
		this.jobPositionDao = jobPositionDao;
	}

	@Override
	public Result addPosition(JobPosition jobPosition) {
		if(jobPositionDao.findBypositionNameEquals(jobPosition.getPositionName()) != null) {
			return new ErrorResult("Bu pozisyon daha once eklenmis ");
		}else {	
			this.jobPositionDao.save(jobPosition);
			return new SuccessResult("Pozisyon eklendi. ");
		}
		
	}

	@Override
	public DataResult<List<JobPosition>> getAll() {
		
		return new SuccessDataResult<List<JobPosition>>(this.jobPositionDao.findAll(),"Job Positions getirildi.");
	}
	
	
	
	

}
