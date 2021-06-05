package com.muratkistan.hrms_service.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muratkistan.hrms_service.entities.concretes.CvBasicAttribute;
import com.muratkistan.hrms_service.entities.concretes.Skill;

public interface CvBasicAttributeDao  extends JpaRepository<CvBasicAttribute, Integer>{
	
	List<CvBasicAttribute> findAllByJobSeekerId(int jobSeekerId);

}
