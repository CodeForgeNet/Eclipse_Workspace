package com.BasicsCal;

import java.util.Scanner;

public class Factorial2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number:- ");
		int num = sc.nextInt();
		
		int fact = 1;
		for(int i=1; i<=num; i++) {
			fact *=i;
		}
		System.out.println(fact);
		
		sc.close();
	}

}
