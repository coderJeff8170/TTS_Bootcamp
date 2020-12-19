package com.jeff.JeffWeatherApp.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import org.hibernate.annotations.CreationTimestamp;

@Entity
public class ZipCode {
	//fields
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "zip_id")
	private Long id;
	
	@CreationTimestamp 
	private Date createdAt;
	

	private String zipCode;
	
	//constructors
	public ZipCode () {
		
	}
	
	//getters and setters
	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	public Long getId() {
		return id;
	}
	
	

	public Date getCreatedAt() {
		return createdAt;
	}
	
}