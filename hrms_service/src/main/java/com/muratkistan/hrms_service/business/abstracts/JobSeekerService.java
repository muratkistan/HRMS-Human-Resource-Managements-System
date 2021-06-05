package com.muratkistan.hrms_service.business.abstracts;

import java.util.List;

import com.muratkistan.hrms_service.core.utilities.result.DataResult;
import com.muratkistan.hrms_service.core.utilities.result.Result;
import com.muratkistan.hrms_service.entities.concretes.JobSeeker;
import com.muratkistan.hrms_service.entities.dtos.CvAllPartDto;

public interface JobSeekerService {
	
	public DataResult<List<JobSeeker>> getAll();
	public Result addJobSeeker(JobSeeker jobSeeker);
	
	DataResult<CvAllPartDto> getJobSeekerCVByJobSeekerId(int candidateId);

}
