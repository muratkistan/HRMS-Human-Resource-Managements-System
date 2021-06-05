package com.muratkistan.hrms_service.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muratkistan.hrms_service.entities.concretes.ForeignLanguage;
import com.muratkistan.hrms_service.entities.concretes.JobExperience;

public interface JobExperienceDao extends  JpaRepository<JobExperience, Integer> {
	
	List<JobExperience> findAllByJobSeekerId(int jobSeekerId);
	
	List<JobExperience> findAllByOrderByLeavingDateAsc();
	
	List<JobExperience> getAllByJobSeekerIdOrderByLeavingDateDesc(int jobSeekerId);
	


}
