package com.springjdbc;

public class Address {

	private String city;
	private String district;
	private int pincode;
	
	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Address(String city, String district, int pincode) {
		super();
		this.city = city;
		this.district = district;
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [city=" + city + ", district=" + district + ", pincode=" + pincode + "]";
	}
	
	
	
}
