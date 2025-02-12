package com.pattern;

import java.util.Scanner;

public class Pyramid_SameCol {
	public static void printPattern(int n) {
//		for(int i=1;i<=n; i++) {   => This is for another star pattern
//			
//			for(int j=1; j<=n; j++) {
//				if(i+j>n+1) {
//					System.out.print("* ");
//				}else {
//					System.out.print(" ");
//				}
//				
//			}
//			System.out.println();
//		}    
		
		
		/*
		 
		* 
      * * * 
    * * * * * 
  * * * * * * * 
* * * * * * * * * 

		 */
		int space = n-1; int star = 1;
		for(int i=1;i<=n;i++) {
			
				for(int j=1;j<=space;j++) {
					System.out.print("  ");
				}
				for(int j=1;j<=star;j++) {
					System.out.print("* ");
				}
				space--; star+=2;
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
