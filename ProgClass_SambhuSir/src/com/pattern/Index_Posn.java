package com.pattern;

import java.util.Scanner;

public class Index_Posn {
	
	public static void printPattern(int n) {
		for(int i=1;i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print("("+i+","+j+")	");
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
