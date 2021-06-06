package com.muratkistan.hrms_service.entities.concretes;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "job_seekers")
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name = "user_id", referencedColumnName = "id")
@JsonIgnoreProperties({ "hibernateLazyInitializer", "handler", "cvBasicAttribute" })
@AllArgsConstructor
@NoArgsConstructor
public class JobSeeker extends User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "identity_number")
	private String identityNumber;

	@Column(name = "birth_year")
	private String birthYear;


	
	//Isaretledim
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "jobSeeker")
	private List<CvBasicAttribute> cvBasicAttribute;
	
	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "jobSeeker")
	private List<ForeignLanguage> foreignLanguages;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "jobSeeker")
	private List<JobExperience> jobExperiences;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "jobSeeker")
	private List<Education> educations;

	@JsonIgnore
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "jobSeeker")
	private List<Skill> skills;



}
