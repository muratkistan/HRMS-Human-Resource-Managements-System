package com.muratkistan.hrms_service.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.muratkistan.hrms_service.business.abstracts.SkillService;
import com.muratkistan.hrms_service.core.utilities.result.DataResult;
import com.muratkistan.hrms_service.core.utilities.result.SuccessDataResult;
import com.muratkistan.hrms_service.dataAccess.abstracts.SkillDao;
import com.muratkistan.hrms_service.entities.concretes.ForeignLanguage;
import com.muratkistan.hrms_service.entities.concretes.Skill;

@Service
public class SkillManager  implements SkillService{
	
	private SkillDao skillDao;
	
	
	
	
	@Autowired
	public SkillManager(SkillDao skillDao) {
		super();
		this.skillDao = skillDao;
	}

	@Override
	public ResponseEntity<DataResult<Skill>> add(Skill skill) {
		
		return ResponseEntity.ok(new SuccessDataResult<>(skillDao.save(skill)));
	}

	@Override
	public ResponseEntity<DataResult<List<Skill>>> getAll() {
		
		return ResponseEntity.ok(new SuccessDataResult<>(skillDao.findAll()));
	}

	@Override
	public ResponseEntity<DataResult<List<Skill>>> findAllByJobSeekerId(int jobSeekerId) {
		
		return ResponseEntity.ok(new SuccessDataResult<>(skillDao.findAllByJobSeekerId(jobSeekerId)));
	}

	

}
