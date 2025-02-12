// Q: Write a Java program to accept two number from the user and calculate the average.
package com.BasicsCal;

import java.util.Scanner;

public class AvgOfTwoNum {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your first number : ");
		int a = scanner.nextInt();
		
		System.out.print("Enter your second number : ");
		int b = scanner.nextInt();
		
		int sum = a+b, avg= sum/2;
		System.out.println("Average of two number is : "+ avg);
		scanner.close();

	}

}
