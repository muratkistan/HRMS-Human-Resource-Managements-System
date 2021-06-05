package com.muratkistan.hrms_service.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "cv_basic_attributes")
public class CvBasicAttribute {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	
	@Column(name = "summary")
	private String summary;
	
	@Column(name = "github_adress")
	private String githubAdress;
	
	@Column(name = "linkedin_adress")
	private String linkedinAdress;

	@ManyToOne()
    @JoinColumn(name = "job_seeker_id")
    private JobSeeker jobSeeker;
	
	
	//isaretledim


}
