package com.BasicsCal;

import java.util.Scanner;

public class Fibonacci {
//	Q. WAJP to print fibonacci series upto n terms.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number:- ");
		
		int num = sc.nextInt();
		int t1 = 0;
		int t2 = 1;
		
		for(int i=0; i<num; i++) {
			int sum = t1 + t2;
			t1 = t2;
			t2 = sum;
			System.out.println(sum );
		}
		
		
		sc.close();
	}

}
