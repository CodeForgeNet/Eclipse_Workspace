package com.exception;

public class CustExcept2 {
	
	    public static void validateAge(int age) throws InvalidAgeException {
	        if ( age > 50) {
	            throw new InvalidAgeException("Invalid age: " + age);
	        }
	    }

	    public static void main(String[] args) {
	        try {
	            validateAge(100);
	        } catch (InvalidAgeException e) {
	        	e.printStackTrace();
	        }
	    }
	}


class InvalidAgeException extends Exception {
		
		public InvalidAgeException() {
			super();
		}
		
	    public InvalidAgeException(String message) {
	        super(message);
	    }
	}
