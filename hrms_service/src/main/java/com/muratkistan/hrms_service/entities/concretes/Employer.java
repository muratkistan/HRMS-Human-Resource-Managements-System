package com.muratkistan.hrms_service.entities.concretes;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;


@Data
@Table(name="employers")
@EqualsAndHashCode(callSuper = false)
@PrimaryKeyJoinColumn(name="user_id",referencedColumnName = "id")
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler","jobAdvertisements"})
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Employer  extends User implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Column(name = "companyName")
	private String companyName;
	
	@Column(name = "webSite")
	private String webSite;
	
	@Column(name = "phoneNumber")
	private String phoneNumber;
	
	@OneToMany(mappedBy="employer", fetch = FetchType.LAZY)
    private List<JobAdvertisement> jobAdvertisements;

	
	
	
	
}
