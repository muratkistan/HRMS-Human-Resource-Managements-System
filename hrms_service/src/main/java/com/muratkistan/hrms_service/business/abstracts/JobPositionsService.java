package com.muratkistan.hrms_service.business.abstracts;

import java.util.List;

import com.muratkistan.hrms_service.entities.concretes.JobPosition;

public interface JobPositionsService {
	
	public void addPosition(JobPosition jobPosition );
	
	public void deletePositionById(int id);
	
	public List<JobPosition> getAllPosition();

}
