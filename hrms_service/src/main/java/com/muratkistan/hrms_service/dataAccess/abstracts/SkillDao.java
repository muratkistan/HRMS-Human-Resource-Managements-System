package com.muratkistan.hrms_service.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muratkistan.hrms_service.entities.concretes.Skill;

public interface SkillDao extends JpaRepository<Skill, Integer> {
	
	List<Skill> findAllByJobSeekerId(int jobSeekerId);
	

}
