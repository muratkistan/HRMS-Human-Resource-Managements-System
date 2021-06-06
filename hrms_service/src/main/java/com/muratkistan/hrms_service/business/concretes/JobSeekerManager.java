package com.muratkistan.hrms_service.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.muratkistan.hrms_service.business.abstracts.CvBasicAttributeService;
import com.muratkistan.hrms_service.business.abstracts.EducationService;
import com.muratkistan.hrms_service.business.abstracts.ForeignLanguageService;
import com.muratkistan.hrms_service.business.abstracts.JobExperienceService;
import com.muratkistan.hrms_service.business.abstracts.JobSeekerService;
import com.muratkistan.hrms_service.business.abstracts.SkillService;
import com.muratkistan.hrms_service.core.adapter.abstracts.FakeMailService;
import com.muratkistan.hrms_service.core.adapter.abstracts.FakeMernisService;
import com.muratkistan.hrms_service.core.utilities.result.DataResult;
import com.muratkistan.hrms_service.core.utilities.result.Result;
import com.muratkistan.hrms_service.core.utilities.result.SuccessDataResult;
import com.muratkistan.hrms_service.core.utilities.result.SuccessResult;
import com.muratkistan.hrms_service.dataAccess.abstracts.JobSeekerDao;
import com.muratkistan.hrms_service.entities.concretes.JobSeeker;
import com.muratkistan.hrms_service.entities.dtos.JobSeekerCvDto;

@Service
public class JobSeekerManager implements JobSeekerService {
	
	private JobSeekerDao jobSeekerDao;
	private FakeMernisService fakeMernisService;
	private FakeMailService fakeMailService;
    private ForeignLanguageService foreignLanguageService;
    private SkillService skillService;
    private CvBasicAttributeService cvBasicAttributeService;
    private EducationService educationService;
    private JobExperienceService jobExperienceService;

	
	

    @Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao, FakeMernisService fakeMernisService,
			FakeMailService fakeMailService, ForeignLanguageService foreignLanguageService, SkillService skillService,
			CvBasicAttributeService cvBasicAttributeService, EducationService educationService,
			JobExperienceService jobExperienceService) {
		super();
		this.jobSeekerDao = jobSeekerDao;
		this.fakeMernisService = fakeMernisService;
		this.fakeMailService = fakeMailService;
		this.foreignLanguageService = foreignLanguageService;
		this.skillService = skillService;
		this.cvBasicAttributeService = cvBasicAttributeService;
		this.educationService = educationService;
		this.jobExperienceService = jobExperienceService;
	}
	
	

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll(),"JobSeekerlar Getirildi.");
		
	}

	@Override
	public Result addJobSeeker(JobSeeker jobSeeker) {
		
//		if(jobSeeker.getFirstName().isEmpty() || jobSeeker.getLastName().isEmpty()
//				|| jobSeeker.getIdentityNumber() == null|| jobSeeker.getBirthYear() == null
//				|| jobSeeker.getEmail() == null || jobSeeker.getPassword() == null ) {
//			return new ErrorResult("Bos alan birakilamaz ! ");
//		}else if(jobSeekerDao.findByIdentityNumberEquals(jobSeeker.getIdentityNumber())!= null) {
//				return new ErrorResult("Kullanilan bir Identity Number girdiniz!");
//		}else if(jobSeekerDao.findByEmailEquals(jobSeeker.getEmail()) != null) {
//			return new ErrorResult("Kullanilan bir Eposta  girdiniz!");
//		}else if(!fakeMernisService.checkIfRealPerson(jobSeeker.getFirstName(), jobSeeker.getLastName(), jobSeeker.getIdentityNumber(), jobSeeker.getBirthYear())) {
//			return new ErrorResult("Mernis Dogrulamasi basariziz. bilgilerinizi kontrol ediniz! ");
//		}else if(!fakeMailService.isMailValidation(jobSeeker.getEmail())) {
//			return new ErrorResult("Eposta dogrulamasi yapmadiniz. kaydiniz olusmadi");
//			
//		}else {
//			jobSeekerDao.save(jobSeeker);
//			return new SuccessResult("Basarili bir sekilde kayit oldunuz .");
//		}
		
		jobSeekerDao.save(jobSeeker);
		return new SuccessResult("Basarili bir sekilde kayit oldunuz .");
		
		
	}
	
	@Override
	public DataResult<JobSeeker> getById(int jobSeekerId) {
		return new SuccessDataResult<JobSeeker>(this.jobSeekerDao.findById(jobSeekerId).get());
		
	}



	@Override
	public DataResult<JobSeekerCvDto> getCVByJobSeekerId(int jobSeekerId) {
		
		JobSeekerCvDto jobSeekerCvDto = new JobSeekerCvDto();
		jobSeekerCvDto.setJobSeeker(this.getById(jobSeekerId).getData());
		jobSeekerCvDto.setForeignLanguages(this.foreignLanguageService.findAllByJobSeekerId(jobSeekerId).getData());
		jobSeekerCvDto.setJobExperiences(this.jobExperienceService.findAllByJobSeekerId(jobSeekerId).getData());
		jobSeekerCvDto.setEducations(this.educationService.findAllByJobSeekerId(jobSeekerId).getData());
		jobSeekerCvDto.setCVBasicAttributes(this.cvBasicAttributeService.findAllByJobSeekerId(jobSeekerId).getData());
		jobSeekerCvDto.setSkills(this.skillService.findAllByJobSeekerId(jobSeekerId).getData());
		return new SuccessDataResult<JobSeekerCvDto>(jobSeekerCvDto);
	}



	
}
