package com.pattern;

import java.util.Scanner;

public class Solid_Sqr {
	
	public static void printPattern(int n) {
		for(int i=1;i<=n; i++) {
			
			for(int j=1; j<=n; j++) {
				if(i==1 || j==1 || i==n || j==n || i==2 || j==2 || i==n-1 || j==n-1 || i+j==n+1 && i==j ) {
//					or for mid pt => i==(n/2+1) && j== (n/2+1).
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
				
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num:- ");
		int n = sc.nextInt();
		
		printPattern(n);
		
		sc.close();
		
	}

}
