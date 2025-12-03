package com.bean;

import java.io.Serializable;

public class Address implements Serializable {
	private String state;
	private String city;
	private int pincode;

	public Address() {
		System.out.println("Default Constructor Address");
	}

	public Address(String state, String city, int pincode) {
		System.out.println("Parameterized Constructor Address");
		this.state = state;
		this.city = city;
		this.pincode = pincode;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		System.out.println("Set State");
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		System.out.println("Set City");
		this.city = city;
	}

	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		System.out.println("Set Pincode");
		this.pincode = pincode;
	}

	@Override
	public String toString() {
		return "Address [state=" + state + ", city=" + city + ", pincode=" + pincode + "]";
	}

}
