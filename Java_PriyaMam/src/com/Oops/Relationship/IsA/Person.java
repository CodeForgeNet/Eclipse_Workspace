package com.Oops.Relationship.IsA;

public class Person  {
	String name;
	int age;
	long phone;
	
//	public Person() {
//		
//	}

		// "abc",24,987665645342l
	public Person(String name, int age, long phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}

	public void display() {
		System.out.println("Name : " + name);
		System.out.println("Age :" + age);
		System.out.println("Mobile No : " + phone);

	}

}
