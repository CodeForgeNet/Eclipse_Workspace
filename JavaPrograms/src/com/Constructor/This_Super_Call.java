package com.Constructor;

class Parent {
	int x;

	Parent(int x) {
		this.x = x;
		System.out.println("Parent constructor with x = " + x);
	}
}

class Child extends Parent {
	int y;

	Child(int x, int y) {
		super(x); // Call to the superclass constructor
		this.y = y;
		System.out.println("Child constructor with y = " + y);
	}

	Child(int x) {
		this(x, 0); // Calls another constructor in the same class
	}
}

public class This_Super_Call {
	public static void main(String[] args) {
		Child child1 = new Child(10, 20);
		System.out.println(); // Just for clarity in output
		Child child2 = new Child(30);
	}
}
