package com.Method;

class Parentt {
	static void myMethod() {
		System.out.println("Parent's method");
	}
}

class Childd extends Parentt {
	static void myMethod() {
		System.out.println("Child's method");
	}
}

public class Shadowing {
	public static void main(String[] args) {
      Parentt p = new Childd();
		p.myMethod(); // Outputs "Parent's method"
	}
}