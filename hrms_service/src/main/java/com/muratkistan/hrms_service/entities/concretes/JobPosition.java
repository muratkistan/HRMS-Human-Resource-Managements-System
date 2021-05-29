package com.muratkistan.hrms_service.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "JobPositon")
public class JobPosition {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ID")
	private int id;
	
	@Column(name = "positionName")
	private String positionName;
	
	@Column(name="capacity")
	private int capacity;

	public JobPosition(String positionName, int capacity) {
		super();
		this.positionName = positionName;
		this.capacity = capacity;
	}
	

	

}
