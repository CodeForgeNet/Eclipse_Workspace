package com.Method;

class Prnt {
	Prnt() {
		System.out.println("Parent constructor");
	}
}

class Chilld extends Prnt {
	Chilld() {
		super(); // Calls the constructor of the superclass (Parent)
		System.out.println("Child constructor");
	}

	Chilld(int x) {
		this(); // Calls the constructor of the same class (Child)
		System.out.println("Child constructor with parameter");
	}
}

public class ThisCall_vs_SuperCall {
	public static void main(String[] args) {
		Chilld obj1 = new Chilld(); 
		Chilld obj2 = new Chilld(5); 
	}
}
