package com.pattern;

import java.util.Scanner;

public class Int_RtTriangle {
		public static void printPattern(int n) {
			int a=1;
			for(int i=1;i<=n; i++) {
				for(int j=1; j<=i; j++) {
					System.out.print(a+" ");
					a++;
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
