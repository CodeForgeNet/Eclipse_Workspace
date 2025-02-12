// Q: Write a java program to convert fahrenheit to celsius and celsius to Fahrenheit using formula   c = (5.0/9.0)*(f-32).
package com.BasicsCal;

import java.util.Scanner;

public class TempConvet {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your farenheit value : ");
		float F = scanner.nextFloat();
		
		double c= (5.0/9.0)*(F-32);
//		float C = (double).c;
		System.out.println(F+"farenheit value in celsius is : "+ c +" celsius");
		scanner.close();
	}

}
