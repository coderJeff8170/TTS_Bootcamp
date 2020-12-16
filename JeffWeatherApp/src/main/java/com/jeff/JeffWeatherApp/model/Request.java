package com.jeff.JeffWeatherApp.model;

//import lombok.Data;

//@Data
public class Request {
	private String zipCode;
	
	public Request () {
		
	}

	public String getZipCode() {
		return zipCode;
	}

	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public String toString() {
		return "Request [zipCode=" + zipCode + ", getZipCode()=" + getZipCode() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
}