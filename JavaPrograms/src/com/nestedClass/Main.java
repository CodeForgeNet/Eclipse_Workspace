package com.nestedClass;

//Write a Java program to create an interface called Greeting with a method sayHello(). In the main method, create an anonymous class that implements the Greeting interface and override the sayHello() method to print "Hello, World!". Call the sayHello() method.

public class Main {
	
	interface Greeting{
		void sayHello();
	}
	
	public static void main(String[] args) {
		//Creating an anonymous class that implements greeting interface.
		Greeting greeting = new Greeting() {
			@Override
			public void sayHello() {
				System.out.println("Hello , world ! ");
			}
		};
		
		greeting.sayHello();
		
	}
}
