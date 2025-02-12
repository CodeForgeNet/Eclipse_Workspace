package com.Method;

public class Override extends A {
	
	void myMethod() {
		System.out.println("B");
	}
	
	public static void main(String[] args) {
		
		Override obj = new Override();
		Override A = new Override();
		
		A.myMethod();
		System.out.println("-----");
		obj.myMethod();
	}
	
}

class A {
		void myMethod() {
			System.out.println("A");
	}
}
