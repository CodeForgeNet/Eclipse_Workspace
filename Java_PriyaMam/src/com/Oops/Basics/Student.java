package com.Oops.Basics;

public class Student {
	
	static String clgname = "Jspiders";
	String name;
	int age;
	
	{
		System.out.println("Student Created");
	}
	
	public Student() {
		
	}
	

	public static void main(String[] args) {
		
		Student s  = new Student();
		Student s2  = new Student();
		
		s.name="Karan";
		System.out.println(s);
		System.out.println(s.name);
		System.out.println(s.clgname);
		
		System.out.println(s2);
		System.out.println(s2.name);
		System.out.println(s2.clgname);
		
	}
	
	public void main() {
		System.out.println("Student can write");
	}

}
