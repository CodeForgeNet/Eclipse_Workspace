package com.exception;

public class CustExcept {
	
	public static void custMethod() throws Except{
		throw new Except("This is custom exception");
	}
	
	public static void main(String[] args) {
		try {
			custMethod();
		} catch (Except e) {

			e.printStackTrace();
		}
	}

}

class Except extends Exception{
	
	public Except() {
		super();
	}
	
	public Except(String msg) {
		super(msg);
	}
	
}
