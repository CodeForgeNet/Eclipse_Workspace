package com.exceptionHandling.self;

public class CustExcExample {

		public static void someMethod() throws CustExcept {
	        throw new CustExcept("This is a custom exception message.");
	    }
		
		public static void main(String[] args) {
			
			try {
				someMethod();
			}catch(CustExcept e) {
				System.out.println("custom exception caught : "+e.getMessage());
			}
			
		}


}
