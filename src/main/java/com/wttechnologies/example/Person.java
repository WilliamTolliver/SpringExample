package com.wttechnologies.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Person {

	// Properties
	private String fName, lName, email;
	@Autowired
	private Address address;

	public Person() {
		// TODO Auto-generated constructor stub

	}

	public Person(String fName, String lName, String email, String city, String state, Address address) {
		this.fName = fName;
		this.lName = lName;
		this.email = email;
		this.address = address;
	}

	public String getfName() {
		return fName;
	}

	@Autowired
	public void setfName(@Value("${fName}")String fName) {
		this.fName = fName;
	}

	public String getlName() {
		return lName;
	}

	@Autowired
	public void setlName(@Value("${lName}")String lName) {
		this.lName = lName;
	}

	public String getEmail() {
		return email;
	}

	@Autowired
	public void setEmail(@Value("${email}")String email) {
		this.email = email;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [fName=" + fName + ", lName=" + lName + ", email=" + email + ", address=" + address.toString()
				+ "]";
	}

}
