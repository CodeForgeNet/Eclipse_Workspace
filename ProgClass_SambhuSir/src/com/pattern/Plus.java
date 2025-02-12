package com.pattern;

import java.util.Scanner;

public class Plus {
	public static void printPattern(int n) {
		for(int i=1;i<=n; i++) {
//			if n is odd then its mid pt is available.
			for(int j=1; j<=n; j++) {
				if((n+1)/2==i || (n+1)/2 ==j ) {
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
