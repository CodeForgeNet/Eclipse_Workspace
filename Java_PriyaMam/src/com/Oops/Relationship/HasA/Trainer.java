package com.Oops.Relationship.HasA;

public class Trainer {

	String name;
	long phone;
	Address add;

	public Trainer(String name, long phone,Address add) {

		this.name = name;
		this.phone = phone;
		this.add = add;
	}

	public void displayInfo() {
		System.out.println("Trainer Name : " + name);
		System.out.println("Trainer Phone : " + phone);
		add.displayAddress();
		
	}

}
