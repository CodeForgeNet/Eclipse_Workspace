package com.pattern;

import java.util.Scanner;

public class Sqr_Same_Row {
	
	public static void printPattern() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter rows:- ");
		int x = sc.nextInt();
		
		System.out.print("Enter columns:- ");
		int y = sc.nextInt();
		
		for(int i=1;i<=x; i++) {
			for(int j=1; j<=y; j++) {
				System.out.print(i+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}

	public static void main(String[] args) {
		printPattern();

	}

}
