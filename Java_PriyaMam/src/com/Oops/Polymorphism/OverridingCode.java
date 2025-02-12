package com.Oops.Polymorphism;

public class OverridingCode {
	public static void main(String[] args) {
		B obj = (B)new A();
		System.out.println(obj);
	}
}

class A{
	
}

class B extends A{
	
}
