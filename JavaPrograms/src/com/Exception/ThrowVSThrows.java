package com.Exception;

public class ThrowVSThrows {
	public static void myMethod() throws Cust {
		throw  new Cust("This is Arithmetic exc by using,throws");
	}
	
	public static void main(String[] args) {
		try {
			myMethod();
		}catch(Cust e) {
			System.out.println(e.getMessage());
		}
	}
	
}


class Cust extends Exception{
	public Cust() {
		super();
	}
	
	public Cust(String message) {
		super(message);
	}
}