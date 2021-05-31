package com.muratkistan.hrms_service.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muratkistan.hrms_service.business.abstracts.EmployerService;
import com.muratkistan.hrms_service.core.adapter.abstracts.FakeHrmsCheckService;
import com.muratkistan.hrms_service.core.adapter.abstracts.FakeMailService;
import com.muratkistan.hrms_service.core.adapter.abstracts.FakeMernisService;
import com.muratkistan.hrms_service.core.utilities.result.DataResult;
import com.muratkistan.hrms_service.core.utilities.result.ErrorResult;
import com.muratkistan.hrms_service.core.utilities.result.Result;
import com.muratkistan.hrms_service.core.utilities.result.SuccessDataResult;
import com.muratkistan.hrms_service.core.utilities.result.SuccessResult;
import com.muratkistan.hrms_service.dataAccess.abstracts.EmployerDao;
import com.muratkistan.hrms_service.entities.concretes.Employer;

@Service
public class EmployerManager implements EmployerService {

	private EmployerDao employerDao;
	private FakeMailService fakeMailService;
	private FakeHrmsCheckService fakeHrmsCheckService;

	@Autowired
	public EmployerManager(EmployerDao employerDao, FakeMailService fakeMailService,
			FakeHrmsCheckService fakeHrmsCheckService) {
		super();
		this.employerDao = employerDao;
		this.fakeMailService = fakeMailService;
		this.fakeHrmsCheckService = fakeHrmsCheckService;
	}

	@Override
	public DataResult<List<Employer>> getAll() {

		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll(), "Employerlar Getirildi");
	}

	@Override
	public Result addEmployer(Employer employer) {

		String[] domain = employer.getEmail().split("@");

		if (employer.getCompanyName() == null || employer.getWebSite() == null
				|| employer.getPhoneNumber() == null || employer.getEmail() == null
				|| employer.getPassword() == null) {
			return new ErrorResult("Bos alan olamaz");
		} else

		if (!domain[0].equals(employer.getWebSite())) {
			return new ErrorResult("e-posta ve web sitesi uyusmuyor.");
		} else

		if (employerDao.findByEmailEquals(employer.getEmail()) != null
				|| employerDao.findByWebSiteEquals(employer.getWebSite()) != null) {
			return new ErrorResult("Bu e posta zaten kullaniliyor");
		} else

		if (!fakeMailService.isMailValidation(employer.getEmail())) {
			return new ErrorResult("Mail dogrulamasi gerceklesmedi. Kayit basarisiz");
		} else if (!fakeHrmsCheckService.confirmUser()) {
			return new ErrorResult("Kayit dogrulanmadi. Islem basarisiz!");
		} 
		else {
			employerDao.save(employer);
			return new SuccessResult("Kayit Basarili bir sekilde olusturuldu");
		}
		
	
	
		
		
	}

}
