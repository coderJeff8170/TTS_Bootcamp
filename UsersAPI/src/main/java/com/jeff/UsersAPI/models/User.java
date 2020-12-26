package com.jeff.UsersAPI.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.Length;

import io.swagger.annotations.ApiModelProperty;

@Entity
public class User {
	
	@ApiModelProperty(notes = "database id number of user")
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@ApiModelProperty(notes = "first name of user")
	@Length(max = 20, message = "Your firstname can't have more than 20 characters")
	private String firstName;
	
	@ApiModelProperty(notes = "last name of user")
	@Length(min = 2, message = "Your lastname must have at least 2 characters")
	private String lastName;
	
	@ApiModelProperty(notes = "user's state of residence")
	@Length(min = 4, max=20, message = "State must have between 4 and 20 characters")
	private String state;
	
	public User () {}
	
	public User(Long id, String firstName, String lastName, String state) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.state = state;
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
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Long getId() {
		return id;
	}
	
}
