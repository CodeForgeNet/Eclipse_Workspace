package com.SelfPattern;

import java.util.Scanner;

public class HollowRect {

	public static void main(String[] args) {
		
		
//		int n = 4, m = 7;
		//outer loop
//		for(int i=1; i<=n; i++) {
//			//inner loop
//			for(int j=1; j<=m; j++) {
//				// cell => (i,j)
//				if (i==1 || j==1 || i==n || j==m) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int n= sc.nextInt();

//		for(int i=1; i<=n; i++) {
//			for(int j=1; j<=n; j++) {
//				if (i==1 || j==1 || i==n || j==n) {
//					System.out.print("* ");
//				}else {
//					System.out.print("  ");
//				}
//			}
//			System.out.println();
//		}
		
		
		
		
		
		
//		two layer
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
//				if (i==1 || i==2 || j==1 || j==2 || i==n ||i==n-1 || j==n || j==n-1) {
				if (i<=2|| j<=2 || i==n ||i==n-1 || j==n || j==n-1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
		sc.close();
	}

}
