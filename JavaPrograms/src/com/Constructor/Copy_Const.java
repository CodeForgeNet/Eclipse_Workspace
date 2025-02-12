package com.Constructor;

public class Copy_Const {
	    private int x;
	    private int y;

	    // Constructor
	    public Copy_Const(int x, int y) {
	        this.x = x;
	        this.y = y;
	    }

	    // Copy constructor
	    public Copy_Const(Copy_Const test) {
	        this.x = test.x;
	        this.y = test.y;
	    }

	    public void display() {
	        System.out.println("x = " + x + ", y = " + y);
	    }

	    public static void main(String[] args) {
	    	Copy_Const test1 = new Copy_Const(10, 20);
	        test1.display();

	        // Using the copy constructor
	        Copy_Const test2 = new Copy_Const(test1);
	        test2.display();
	    }
	}
