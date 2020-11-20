package com.tts.subscriberlist2.subscriber;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Subscriber {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	//tells db to autogenerate the id
	private Long id;
	
	private String firstName;
	private String lastName;
	private String userName;
	
	@Column
	//^^google this!!
	@CreationTimestamp
	//tells db to put timestamp here
	private Date signedUp;
	
	public Subscriber() {
		//no arg constructor - needed for JPA
	}
	
    public Subscriber(String firstName, String lastName, String userName, Date signedUp){
	this.firstName = firstName;
	this.lastName = lastName;
	this.userName = userName;
	this.signedUp = signedUp;
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

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public Date getSignedUp() {
		return signedUp;
	}

	public void setSignedUp(Date signedUp) {
		this.signedUp = signedUp;
	}

	@Override
	public String toString() {
		return "Subscriber [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", userName=" + userName
				+ ", signedUp=" + signedUp + "]";
	}	

    
}
