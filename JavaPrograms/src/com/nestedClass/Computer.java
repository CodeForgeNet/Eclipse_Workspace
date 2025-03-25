package com.nestedClass;

//Write a Java program to create an outer class called Computer with an inner class Processor. The Processor class should have a method "displayDetails()" that prints the details of the processor (e.g., brand and speed). Create an instance of Processor from the Computer class and call the "displayDetails()" method.

public class Computer {
	
	class Processor{
		public void displayDet() {
			System.out.println("Processor : Intel");
		}
	}
	
	//method to create and display the processor
	void showProcessor() {
		Processor p = new Processor();
		p.displayDet();
	}
	
	public static void main(String[] args) {
		Computer c = new Computer();
		c.showProcessor();
	}

}
