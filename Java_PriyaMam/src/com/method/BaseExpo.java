package com.method;

//import java.util.Scanner;

public class BaseExpo {
//	THIS IS FORMAL ARGUMENT  & PARAMETERISED USER DEFINE METHOD.
	public static void power(int base, int expo) {
		int power = 1;
		for(int i=1; i<=expo;i++) {
			power *=base;
		}
		System.out.println(power);
		
	}

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter base:- ");
//		int base = sc.nextInt();
//		System.out.print("Enter expo:- ");
//		int expo = sc.nextInt();
//		power(base, expo);
		
//		 OR
		
//		THIS IS ACTUAL ARGUMENT.
		power(2, 3);
		
//		sc.close();
	}

}
