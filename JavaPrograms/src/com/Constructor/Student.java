package com.Constructor;

//Write a Java program to create a class called "Book" with instance variables title, author, and price. Implement a default constructor and two parameterized constructors:
//	-One constructor takes title and author as parameters.
//	-The other constructor takes title, author, and price as parameters.
//	-Print the values of the variables for each constructor.

public class Student {
	int studId;
	String studName;
	String grade;
	
	public Student() {
		this(0,"unknow","none");
	}
	
	public Student(int studId, String studName, String grade) {
		this.studId = studId;
		this.studName = studName;
		this.grade = grade;
	}
	
	public static void main(String[] args) {
		Student s1 = new Student();
		System.out.println(s1.studId+", "+s1.studName+", "+s1.grade);
		
		Student s2 = new Student(12,"karan","A");
		System.out.println(s2.studId+", "+s2.studName+", "+s2.grade);
	}
	
	
}
