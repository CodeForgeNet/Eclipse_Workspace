package com.exception;

public class CustExcept3 {
	
    public static void validateAge(int age) throws IsDriving {
        if (age > 0 && age < 18) {
            throw new IsDriving("Invalid age: " + age);
        }
    }

    public static void main(String[] args) {
        try {
            validateAge(10);
            System.out.println("drive");
        } catch (IsDriving e) {
        	e.printStackTrace();
        }
    }
}


class IsDriving extends Exception {
	
	public IsDriving() {
		super();
	}
	
    public IsDriving(String message) {
        super(message);
    }
}
