package com.tts.cars.car;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Car {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	private String make;
	private String model;
	private int year;
	private String description;
	private String photoURL;
	
	@Column
	@CreationTimestamp
	private Date created;
	
	public Car() {
		//no arg constructor - needed for JPA
	}
	
    public Car(String make, String model, int year, String description, String photoURL, Date created){
	this.make = make;
	this.model = model;
	//could cause problems as an int when input is a string?
	this.year = year;
	this.description = description;
	this.photoURL = photoURL;
	this.created = created;
}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPhotoURL() {
		return photoURL;
	}

	public void setPhotoURL(String photoURL) {
		this.photoURL = photoURL;
	}

	public Date getCreated() {
		return created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", make=" + make + ", model=" + model + ", year=" + year + ", description="
				+ description + ", photoURL=" + photoURL + ", created=" + created + "]";
	}	

    
}
