package com.muratkistan.hrms_service.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muratkistan.hrms_service.entities.concretes.Employer;

public interface EmployerDao extends JpaRepository<Employer, Integer>{
	
	Employer findByEmailEquals(String findEmail);
	Employer findByWebSiteEquals(String findWebsite);
	Employer findByPhoneNumberEquals(String findPhoneNumber);

}
