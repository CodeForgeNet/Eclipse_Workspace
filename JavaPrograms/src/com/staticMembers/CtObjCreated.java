package com.staticMembers;

//Static Variables:
//Write a Java program to create a class called "Counter" with a static variable count. Implement a constructor that increments count every time an object is created. Print the value of count after creating several objects.

public class CtObjCreated {
	static int ct = 0;
	
	public CtObjCreated() {
		ct++;
	}
	
	public static int getCount() {
		return ct;
	}
	
	public static void main(String[] args) {
		CtObjCreated ct1 = new CtObjCreated();
		CtObjCreated ct2 = new CtObjCreated();
		CtObjCreated ct3 = new CtObjCreated();
		
		System.out.println("Total object created : "+getCount());
		
	}
}
