package com.pattern;

import java.util.Scanner;

public class Pyramid_Rt {
//	Assignment => for  Right side pyramid. 
	/*
             *
           * *
         * * *
           * *
             *
	 */
	public static void printPattern(int n) {
		int star =1;
		int space = n/2;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
				System.out.print("  ");
			}
			for(int j=1;j<=star;j++) {
				System.out.print("* ");
			}
			
			
			if(i<n/2+1) {
				star++;
				space--;
			}else {
				star--;
				space++;
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
