package com.muratkistan.hrms_service.business.abstracts;

import java.util.List;

import com.muratkistan.hrms_service.core.utilities.result.DataResult;
import com.muratkistan.hrms_service.core.utilities.result.Result;
import com.muratkistan.hrms_service.entities.concretes.JobAdvertisement;

public interface JobAdvertisementService {

	Result addJobAdvertisment(JobAdvertisement jobAdvertisement);

	DataResult<List<JobAdvertisement>> getAll(); // Butun ilanlar. JpaRepositoryninkendi finAll methodunu kullanacagiz

	DataResult<List<JobAdvertisement>> getByIsActiveTrue(); 

	DataResult<List<JobAdvertisement>> getByIsActiveTrueOrderByPublishDate(); 

	DataResult<List<JobAdvertisement>> getByIsActiveTrueAndEmployer_CompanyName(String companyName);
	
	DataResult<List<JobAdvertisement>> getByEmployer_CompanyName(String companyName); 

}
