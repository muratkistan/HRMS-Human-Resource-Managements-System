package com.muratkistan.hrms_service.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muratkistan.hrms_service.entities.concretes.JobPosition;

public interface JobPositionDao extends JpaRepository<JobPosition, Integer> {
	
	public JobPosition findBypositionNameEquals(String positionName);

}
