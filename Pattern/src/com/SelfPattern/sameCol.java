package com.SelfPattern;

import java.util.Scanner;

public class sameCol {
	
	public static void sameCol(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number : ");
		int n = sc.nextInt();
		sameCol(n);
		sc.close();
	}

}
