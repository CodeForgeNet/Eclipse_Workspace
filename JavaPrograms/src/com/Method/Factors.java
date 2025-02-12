package com.Method;

import java.util.Scanner;

public class Factors {
	public static void factor(int a) {
		int count =0;
		for(int i=1;i<=a;i++) {
			if(a%i==0) {
				count+=i;
			}
		}
		System.out.println("Total Factors of "+a+" is :- "+count);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to find factors:- ");
		int num = sc.nextInt();
		
		factor(num);
		
		
		sc.close();
	}

}
