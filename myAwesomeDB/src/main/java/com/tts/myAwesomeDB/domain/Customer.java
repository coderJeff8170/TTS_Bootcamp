package com.tts.myAwesomeDB.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    
    public Customer(){
        //@Entity needs a non-argument constructor - java will make one if you don't
    }
    
    public Customer(String lname, String fname) {
    	this.firstName = fname;
    	this.lastName = lname;
    }

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
}
