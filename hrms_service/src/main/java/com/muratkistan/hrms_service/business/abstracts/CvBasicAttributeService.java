package com.muratkistan.hrms_service.business.abstracts;

import java.util.List;

import org.springframework.http.ResponseEntity;

import com.muratkistan.hrms_service.core.utilities.result.DataResult;
import com.muratkistan.hrms_service.entities.concretes.CvBasicAttribute;
import com.muratkistan.hrms_service.entities.concretes.Skill;

public interface CvBasicAttributeService {

	ResponseEntity<DataResult<CvBasicAttribute>> add(CvBasicAttribute cvBasicAttribute);
    ResponseEntity<DataResult<List<CvBasicAttribute>>> getAll();
    
    DataResult<List<CvBasicAttribute>> findAllByJobSeekerId(int jobSeekerId);
}
