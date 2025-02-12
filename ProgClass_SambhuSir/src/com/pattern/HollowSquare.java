package com.pattern;

import java.util.Scanner;

public class HollowSquare {
	
	public static void hlwSqr(int n) {
		int initS = 0;
		for(int i=0; i<n; i++) {
//			stars
			for(int j=1; j<=n-i; j++) {
				System.out.print("* ");
			}
			
//			spaces
			for(int j=0; j<initS; i++) {
				System.out.print("  ");
			}
			
//			stars
			for(int j=1; j<=n-i; j++) {
				System.out.print("* ");
			}
			
			
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter num : ");
		int n = sc.nextInt();
		
		hlwSqr(n);
		
		sc.close();
	}

}
