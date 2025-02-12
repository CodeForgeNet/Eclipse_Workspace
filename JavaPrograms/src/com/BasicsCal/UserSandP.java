//Write a java program to accept a two number and calculate the sum and product.
package com.BasicsCal;

import java.util.Scanner;

public class UserSandP {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your first number A : ");
		int A = scanner.nextInt();
		
		System.out.print("Enter your second number B : ");
		int B = scanner.nextInt();
		
		int sum= A+ B, product= A*B;
		System.out.println("Sum of given number is : "+ sum);
		System.out.println("Product of given number is : "+product);
		
		scanner.close();

	}

}
