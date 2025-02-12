package com.Oops.Relationship.HasA;

public class Student {

	String name;
	long phone;
	Address studentAddress;
	/*
	String houseno;
	int pincode;
	String city;
	String state;
*/
	public Student(String name, long phone,Address studentAddress) {

		this.name = name;
		this.phone = phone;
		this.studentAddress = studentAddress;
	}

	public void displayStudent() {
		System.out.println("Student Name : " + name);
		System.out.println("Student Phone : " + phone);
		studentAddress.displayAddress();
		
		
		/*
		System.out.println("Address =>  ");
	
		System.out.println("House No. - " + houseno);
		System.out.println("PinCode - " + pincode);
		System.out.println("City - " + city);

		System.out.println("state - " + state);
*/
	}

}


