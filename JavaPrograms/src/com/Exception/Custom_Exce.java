package com.Exception;

public class Custom_Exce {
	
	public static void custMet() throws Cust_Exception{
		throw new Cust_Exception("This is cust exception");		
	}
	
	public static void main(String[] args) {

		try {
			custMet();
		} catch (Cust_Exception e) {
			System.out.println(e.getMessage());
			System.out.println(e);
		}
	}
}

class Cust_Exception extends Exception {
	public Cust_Exception() {
		super();
	}

	public Cust_Exception(String message) {
		super(message);
	}
}