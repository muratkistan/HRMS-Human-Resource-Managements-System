package com.muratkistan.hrms_service.dataAccess.abstracts;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.muratkistan.hrms_service.core.utilities.result.DataResult;
import com.muratkistan.hrms_service.entities.concretes.JobAdvertisement;

public interface JobAdvertisementDao extends JpaRepository<JobAdvertisement, Integer> {
	
	List<JobAdvertisement> getByIsActiveTrue();  // sadece aktif olanlar
	
	List<JobAdvertisement> getByIsActiveTrueOrderByPublishDate();  //Tarihe gore sirali
	
	List<JobAdvertisement> getByIsActiveTrueAndEmployer_CompanyName(String companyName); // Sirketin aktif ilanlari
	
	List<JobAdvertisement> getByEmployer_CompanyName(String companyName); //Sirketin butun ilanlari

}
