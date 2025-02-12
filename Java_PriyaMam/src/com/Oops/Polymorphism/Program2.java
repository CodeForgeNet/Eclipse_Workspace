package com.Oops.Polymorphism;

public class Program2 {
	// Method Declaration
		public static void m1(int i )  // 
		{
			System.out.println("m1 int ");
		}
		
		public static void m1(double i ) //// Method Declaration
		{
			System.out.println("m1 double ");
		}
		
		
		public static void m1(byte i ) {  // Method Declaration
			System.out.println("m1 byte ");
		}
		
		public static void main(String[] args) {
			m1(2);   // ==> method call statement m1(int)
		}


}
