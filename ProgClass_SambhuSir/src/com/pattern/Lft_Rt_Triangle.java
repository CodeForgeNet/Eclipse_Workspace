package com.pattern;

import java.util.Scanner;

public class Lft_Rt_Triangle {
	
	public static void printPattern(int n) {
		for(int i=1;i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
//		for(int i=1;i<=5; i++) {
//			for(int j= i; j>=1; j--) {
//				System.out.print("* ");
//			}
//			System.out.println();
//		}
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num:- ");
		int n = sc.nextInt();
		
		printPattern(n);
		sc.close();
	}

}
