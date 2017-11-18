package com.wttechnologies.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Address {

	private String city, state;
	private int zip;

	public Address() {
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String state, int age) {
		this.city = city;
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	@Autowired
	public void setCity(@Value("Marietta") String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	@Autowired
	public void setState(@Value("Georgia") String state) {
		this.state = state;
	}

	public int getZip() {
		return zip;
	}

	@Autowired
	public void setZip(@Value("30309") int zip) {
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", state=" + state + ", zip=" + zip + "]";
	}

	

}
