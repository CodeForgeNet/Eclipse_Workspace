package com.SelfPattern;

import java.util.Scanner;

public class SameRowDig {
	
	public static void sameRow(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=0; j<n; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		sameRow(n);
		
	}

}
