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
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "foreign_languages")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","resume"})
public class ForeignLanguage {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private int id;
	
	@Column(name = "language_name")
	private String languageName;
	
	
	@Column(name = "language_level")
	private int languageLevel;
	
	
	@ManyToOne
//	@JsonIgnore
	@JoinColumn(name = "jobSeeker_id")
	private JobSeeker jobSeeker;
	
	

}
