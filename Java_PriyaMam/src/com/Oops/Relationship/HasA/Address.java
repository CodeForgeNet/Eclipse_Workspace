package com.Oops.Relationship.HasA;

public class Address {

	String houseno;
	int pincode;
	String city;
	String state;

	public Address(String houseno, int pincode, String city, String state) {

		this.houseno = houseno;
		this.pincode = pincode;
		this.city = city;
		this.state = state;
	}

	public void displayAddress() {
		System.out.println("Address =>  ");
		System.out.println("House No. - " + houseno);
		System.out.println("PinCode - " + pincode);
		System.out.println("City - " + city);

		System.out.println("state - " + state);
	}
}
