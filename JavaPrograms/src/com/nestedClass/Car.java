package com.nestedClass;

//Write a Java program to create a class called Car with a method startEngine(). Inside this method, define a local class Engine that has a method run(). The run() method should print "Engine is running". Instantiate and call the run() method from within the startEngine() method.

public class Car {
	public void startEngine() {
		class Engine{
			void run() {
				System.out.println("Engine is running");
			}
		}
		Engine e = new Engine();
		e.run();
	}
	
	public static void main(String[] args) {
		Car c = new Car();
		c.startEngine();
	}
}
