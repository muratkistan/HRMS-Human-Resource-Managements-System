package com.muratkistan.hrms_service.core.adapter.concretes;

import org.springframework.stereotype.Service;

import com.muratkistan.hrms_service.core.adapter.abstracts.FakeMernisService;

@Service
public class FakeMernisManager implements FakeMernisService {

	@Override
	public boolean checkIfRealPerson(String firstName, String lastName, String identityNumber, String birthYear) {
		
		if(identityNumber.length()!=11) {
			return false;
		}
		
		if(firstName.length() <= 2 || lastName.length() <= 2 ) {
			return false;
		}
		
		return true;
	}

}
