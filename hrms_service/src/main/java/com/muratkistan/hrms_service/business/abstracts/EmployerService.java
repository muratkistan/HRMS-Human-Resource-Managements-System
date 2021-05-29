package com.muratkistan.hrms_service.business.abstracts;

import java.util.List;

import com.muratkistan.hrms_service.core.utilities.result.DataResult;
import com.muratkistan.hrms_service.core.utilities.result.Result;
import com.muratkistan.hrms_service.entities.concretes.Employer;

public interface EmployerService {

	public DataResult<List<Employer>> getAll();
	public Result addEmployer(Employer employer);
	
}
