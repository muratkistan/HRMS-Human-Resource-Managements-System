package com.muratkistan.hrms_service.business.abstracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.muratkistan.hrms_service.core.utilities.result.DataResult;
import com.muratkistan.hrms_service.entities.concretes.ForeignLanguage;
import com.muratkistan.hrms_service.entities.concretes.Skill;

public interface SkillService {

	ResponseEntity<DataResult<Skill>> add(Skill skill);

	ResponseEntity<DataResult<List<Skill>>> getAll();
	
	DataResult<List<Skill>> findAllByJobSeekerId(int jobSeekerId);
	

}
