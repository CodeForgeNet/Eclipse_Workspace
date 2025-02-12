package com.pattern;

import java.util.Scanner;

public class RtTglCol_1_0 {
	public static void printPattern(int n) {
		for(int i=1;i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print(j%2+" ");
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
