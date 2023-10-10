package Rushikesh.com.SpringPractice.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

public class Address {
	
	@Autowired
	private Student stud;
	
	private String street;
	private String city;
	
	
	public String getStreet() {
		return street;
	}
	public void setStreet(String street) {
		this.street = street;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address [street=" + street + ", city=" + city + "]";
	}
	


}
