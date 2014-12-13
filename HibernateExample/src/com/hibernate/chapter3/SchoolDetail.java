package com.hibernate.chapter3;

import javax.persistence.Embeddable;

@Embeddable
public class SchoolDetail {

	private String address;
	private String city;
	
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
	
}
