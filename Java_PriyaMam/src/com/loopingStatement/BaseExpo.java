package com.loopingStatement;

import java.util.Scanner;

public class BaseExpo {

	public static void main(String[] args) {
//		Q. WAJP to read base and exponent from the user to print the result of power.
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter base number:- ");
		int base = sc.nextInt();
		
		System.out.print("Enter Power number:- ");
		 int expo = sc.nextInt();
		 
		 int power = 1;
		 for(int i=1; i<=expo; i++) {
			 power *=base;
		 }
		 System.out.println(power);
		 
		 
		 sc.close();
	}

}
