package com.muratkistan.hrms_service.entities.concretes;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="job_advertisements")
@AllArgsConstructor
@NoArgsConstructor
public class JobAdvertisement implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name = "job_description")
	private String jobDescription;
	
	@Column(name = "min_salary")
	private double minSalary;
	
	@Column(name = "max_salary")
	private double maxSalary;
	
	@Column(name = "quota")
	private int quota;
	
	@Column(name = "publish_date",columnDefinition = "Date default  CURRENT_DATE")
	private LocalDate publishDate=LocalDate.now();
	
	@Column(name = "deadline_date",columnDefinition = "Date default  CURRENT_DATE")
	private LocalDate deadlineDate= LocalDate.now();
	
	@Column(name = "is_active")
	private boolean isActive;
	
	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="employer_id") 
    private Employer employer;

	@ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="job_position_id")
    private JobPosition jobPosition;
	
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="city_id")
    private City city;
	
}
