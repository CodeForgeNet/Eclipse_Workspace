package com.pattern;

import java.util.Scanner;

public class Solid_Sqr2 {
	public static void printPattern(int n) {
		for(int i=1;i<=n; i++) {
			
			for(int j=1; j<=n; j++) {
				if(i==1 || j==1 || i==n || j==n || i==j || i+j==n+1  || i==(n+1)/2 || j==(n+1)/2) {
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
