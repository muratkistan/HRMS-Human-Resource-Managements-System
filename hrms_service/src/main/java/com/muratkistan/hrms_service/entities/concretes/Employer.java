package com.muratkistan.hrms_service.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@Entity
@Table(name="employers")
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name="user_id", referencedColumnName = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","jobPostings"})
@AllArgsConstructor
@NoArgsConstructor
public class Employer  extends User{

	@Column(name = "companyName")
	private String companyName;
	
	@Column(name = "webSite")
	private String webSite;
	
	@Column(name = "phoneNumber")
	private String phoneNumber;

	
	
	
	
}
