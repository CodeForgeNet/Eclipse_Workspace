package com.loopingStatement;

import java.util.Scanner;

public class FactorialInRange {

	public static void main(String[] args) {
//		Q. WAJP to find out the factorial within user define range.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number for finding factorial:- ");
		int num = sc.nextInt();
		
		if (num<0) {
			System.out.println("Invalid : Number should be non-negative");
			return;
		}
		
		
		
		System.out.println("Enter the Starting range:- ");
		int start = sc.nextInt();
		
		if (start<1 || start>num) {
			System.out.println("Invalid : Starting range must be between 1 and "+ num);
			return;
		}
		
		
		
		System.out.println("Enter the Ending range:- ");
		int end = sc.nextInt();
		
		if(end<start || end > num) {
			System.out.println("Invalid : endign range must be between 1 and "+num);
			return;
		}
		
		
		int factorial = 1;
		for(int i=start; i<=end; i++) {
			factorial *=i;
		}
		System.out.println("Factorial within range of "+start+ " and "+ end+ " is:- "+factorial);
		
		
		
		sc.close();
	}

}
