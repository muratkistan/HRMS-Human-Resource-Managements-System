package com.muratkistan.hrms_service.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muratkistan.hrms_service.business.abstracts.JobAdvertisementService;
import com.muratkistan.hrms_service.core.utilities.result.DataResult;
import com.muratkistan.hrms_service.core.utilities.result.Result;
import com.muratkistan.hrms_service.core.utilities.result.SuccessDataResult;
import com.muratkistan.hrms_service.core.utilities.result.SuccessResult;
import com.muratkistan.hrms_service.dataAccess.abstracts.JobAdvertisementDao;
import com.muratkistan.hrms_service.entities.concretes.JobAdvertisement;

@Service
public class JobAdvertisementManager implements JobAdvertisementService {
	
	private JobAdvertisementDao jobAdvertisementDao;
	

	@Autowired
	public JobAdvertisementManager(JobAdvertisementDao jobAdvertisementDao) {
		super();
		this.jobAdvertisementDao = jobAdvertisementDao;
	}


	@Override
	public Result addJobAdvertisment(JobAdvertisement jobAdvertisement) {
		 this.jobAdvertisementDao.save(jobAdvertisement);
	        return new SuccessResult("Job Advertısement basarıyla olusturuldu.");
	}


	@Override
	public DataResult<List<JobAdvertisement>> getAll() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.findAll(),"Tüm İş İlanları Listelendi");
	}


	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveTrue() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIsActiveTrue(), "Aktif İş İlanları Listelendi" );
	}


	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveTrueOrderByPublishDate() {
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByIsActiveTrueOrderByPublishDate(),"Ilanlar Tarihe gore siralandi");
	}


	@Override
	public DataResult<List<JobAdvertisement>> getByIsActiveTrueAndEmployer_CompanyName(String companyName) {
		return new SuccessDataResult<List<JobAdvertisement>> (this.jobAdvertisementDao.getByIsActiveTrueAndEmployer_CompanyName(companyName), "Firmaya ait ilanlar getirildi");
	}


	@Override
	public DataResult<List<JobAdvertisement>> getByEmployer_CompanyName(String companyName) {
		
		return new SuccessDataResult<List<JobAdvertisement>>(this.jobAdvertisementDao.getByEmployer_CompanyName(companyName),"asd");
	}


	

	

}
