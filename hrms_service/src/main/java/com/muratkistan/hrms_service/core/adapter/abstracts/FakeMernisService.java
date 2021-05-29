package com.muratkistan.hrms_service.core.adapter.abstracts;

public interface FakeMernisService {
	
	boolean checkIfRealPerson(String firstName, String lastName,
			String identityNumber, String birthYear);

}
