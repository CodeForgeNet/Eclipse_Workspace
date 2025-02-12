package com.Method;

import java.util.Scanner;

public class ProdEvenInRange {
	
		static void ProdEven(int a, int b) {
		int sum = 0;
		for(int i=a;i<=b;i++) {
			if(i%2==0) {
				sum+=i;
			}
		}
		System.out.println("Sum of Even number :- "+sum);
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Starting range:- ");
		int x = sc.nextInt();
		
		System.out.print("Enter Last range:- ");
		int y = sc.nextInt();
		
		ProdEven(x, y);

		
		
		sc.close();
	}

}
