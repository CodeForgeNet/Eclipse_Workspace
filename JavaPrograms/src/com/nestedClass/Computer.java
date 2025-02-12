package com.nestedClass;

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
