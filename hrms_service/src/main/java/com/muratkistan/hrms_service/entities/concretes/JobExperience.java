package com.muratkistan.hrms_service.entities.concretes;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "job_experiences")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","resume"})
public class JobExperience {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "company_name")
	private String companyName;

	@Column(name = "position")
	private String position;

	@Column(name = "starting_date")
	private LocalDate startingDate=LocalDate.now();

	@Column(name = "leaving_date")
	private LocalDate leavingDate=LocalDate.now();


	@ManyToOne
//	@JsonIgnore
	@JoinColumn(name = "jobseeker_id")
	private JobSeeker jobSeeker;

}
