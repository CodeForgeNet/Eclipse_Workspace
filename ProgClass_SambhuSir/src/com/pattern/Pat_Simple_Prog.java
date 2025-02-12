package com.pattern;

import java.util.Scanner;

public class Pat_Simple_Prog {
	public static void printPattern(int n) {
		int x=1; 
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
				
				System.out.printf("%-5d",x);
				x++;
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
