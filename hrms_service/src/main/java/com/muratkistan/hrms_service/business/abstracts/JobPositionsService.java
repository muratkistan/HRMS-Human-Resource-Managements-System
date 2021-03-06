package com.muratkistan.hrms_service.business.abstracts;

import java.util.List;

import com.muratkistan.hrms_service.core.utilities.result.DataResult;
import com.muratkistan.hrms_service.core.utilities.result.Result;
import com.muratkistan.hrms_service.entities.concretes.JobPosition;

public interface JobPositionsService {
	

	
	Result addPosition(JobPosition jobPosition);
	
	DataResult<List<JobPosition>> getAll();
	
	

}
