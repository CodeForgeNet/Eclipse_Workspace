package com.loopingStatement;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
//		Q. WAJP to find the factorial of a number given by user.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number:- ");
		int num = sc.nextInt();
		
		int a = 1;
		int fact = 1;
		
		while(a<=num) {
			fact *=a;
			a++;
		}
		System.out.println(fact);
		
		sc.close();
	}

}
