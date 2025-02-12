package com.pattern;

import java.util.Scanner;

public class RtTglMix_0_1 {
	public static void printPattern(int n) {
		for(int i=1;i<=n; i++) {
			for(int j=1; j<=i; j++) {
				System.out.print((i+j)%2+" ");
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
