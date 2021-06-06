package com.muratkistan.hrms_service.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "skills")
//@JsonIgnoreProperties({"hibernateLazyInitializer","handler","resume"})
public class Skill {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "skill_name")
	private String skillName;
	
	@Column(name = "technology_name")
	private String technologyName;
	
	@ManyToOne
//	@JsonIgnore
    @JoinColumn(name = "jobseeker_id")
    private JobSeeker jobSeeker;

}
