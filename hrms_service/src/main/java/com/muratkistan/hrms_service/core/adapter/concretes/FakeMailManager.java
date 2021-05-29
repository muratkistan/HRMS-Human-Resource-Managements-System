package com.muratkistan.hrms_service.core.adapter.concretes;

import org.springframework.stereotype.Service;

import com.muratkistan.hrms_service.core.adapter.abstracts.FakeMailService;

@Service
public class FakeMailManager implements FakeMailService {

	@Override
	public boolean isMailValidation(String email) {
		System.out.println(email + "icin  Mail dogrulamasi basarili");
		return true;
	}

}
