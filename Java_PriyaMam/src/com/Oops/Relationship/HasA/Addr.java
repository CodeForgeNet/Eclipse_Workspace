package com.Oops.Relationship.HasA;

public class Addr {
	String houseno;
	int pincode;
	String city;
	String state;
	
	public Addr(String houseno, int pincode, String city, String state) {
		this.houseno=houseno;
		this.pincode=pincode;
		this.city=city;
		this.state=state;
	}
	
	public void displayAddr() {
		
		System.out.println("\n\n🏠 Address :- ");
		System.out.println("House no - "+houseno);
		System.out.println("Pincode - "+pincode);
		System.out.println("City - "+ city);
		System.out.println("State - "+state);
		
		
	}

}
