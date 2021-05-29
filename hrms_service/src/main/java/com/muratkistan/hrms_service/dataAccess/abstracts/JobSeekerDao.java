package com.muratkistan.hrms_service.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muratkistan.hrms_service.entities.concretes.JobSeeker;

public interface JobSeekerDao  extends JpaRepository<JobSeeker, Integer> {
	
	
	JobSeeker findByIdentityNumberEquals(String findIdentityNumber);
	JobSeeker findByEmailEquals(String findEmail);
	
	
	

}
