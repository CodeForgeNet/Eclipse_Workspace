package com.nestedClass;

// Write a Java program to create an outer class called 'MathUtil' with a static nested class Calculator. The Calculator class should have a static method add(int a, int b) that returns the sum of a and b. Call the add() method from the main method.

public class MathUtil {
	public static class Calculator{
		public static int add(int a, int b) {
			return a+b;
		}
	}
	
	public static void main(String[] args) {
		MathUtil.Calculator mtCal = new MathUtil.Calculator();
		System.out.println(mtCal.add(5, 6));
	}
}
