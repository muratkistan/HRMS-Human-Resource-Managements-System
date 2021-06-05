package com.muratkistan.hrms_service.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muratkistan.hrms_service.entities.concretes.Education;

public interface EducationDao extends JpaRepository<Education, Integer> {
	
	List<Education> findAllByJobSeekerId(int jobSeekerId);

}
