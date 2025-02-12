package com.pattern;

import java.util.Scanner;

public class LftOpp_RtTriangle2 {
	public static void printPattern(int n) {
		for(int i=1;i<=n; i++) {
			for(int j=1; j<=n; j++) {
				if(i+j>n+1) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter num:- ");
		int n = sc.nextInt();
		
		printPattern(n);
		sc.close();
	}

}
