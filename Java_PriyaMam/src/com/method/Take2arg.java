package com.method;

import java.util.Scanner;

public class Take2arg {
	
	public static void sum(int a, int b) {
		int sum = a+b;
		System.out.println(sum);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first num:- ");
		int x = scanner.nextInt();
		
		System.out.println("Enter second num:- ");
		int y = scanner.nextInt();
		
		sum(x, y);
		
		scanner.close();
	}

}
