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

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "educations")
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler","resume"})
public class Education {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "school_name")
	private String schoolName ;
	
	@Column(name = "department_name")
	private String departmentName;
	
	@Column(name = "starting_date")
	private LocalDate startingDate=LocalDate.now();
	
	@Column(name = "leaving_date")
	private LocalDate leavingDate=LocalDate.now();
	
	@Column(name="is_graduated")
	private boolean isGraduated;
	
	//isaretledim
	@ManyToOne
	@JoinColumn(name = "jobseeker_id")
	private JobSeeker jobSeeker;
	
	

}
