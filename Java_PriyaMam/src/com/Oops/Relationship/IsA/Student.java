package com.Oops.Relationship.IsA;

public class Student extends Person {
	// name, age, phone > inherited from => Person
	// studentId,clgName > student class specific states
	String studentId;
	String clgName;
					  // "abc",24,987665645342l,"JSP123","jspider"
	public Student(String name, int age, long phone, String studentId, String clgName) {
//		super(); // calling No args Constructor of Person
		super(name,age,phone); // Calling Person(String name, int age, long phone)
		
		this.studentId = studentId;
		this.clgName = clgName;

	}

	public void display() {
		
		/*
		 * System.out.println("Name : " + name); System.out.println("Age :" + age);
		 * System.out.println("Mobile No : " + phone);
		 */

		super.display(); // Non static method Person

		System.out.println("Student Id : " + studentId);
		System.out.println("Clg Name :  " + clgName);
	}

}
