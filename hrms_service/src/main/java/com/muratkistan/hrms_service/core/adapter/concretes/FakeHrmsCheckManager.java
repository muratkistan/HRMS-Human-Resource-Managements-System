package com.muratkistan.hrms_service.core.adapter.concretes;

import org.springframework.stereotype.Service;

import com.muratkistan.hrms_service.core.adapter.abstracts.FakeHrmsCheckService;

@Service
public class FakeHrmsCheckManager implements FakeHrmsCheckService {

	@Override
	public boolean confirmUser() {
		
		return true;
	}

}
