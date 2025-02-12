package com.SelfPattern;

import java.util.Scanner;

public class CompanyQue {

	public static void printPattern(int n) {
		int mid = n/2 +1;
		int space = n/2;
		int sst=n+2; 
		int est = 2*n-1;
		
		for(int i=1; i<=n; i++) {
//			part1
			for(int j=1; j<=mid; j++) {
				if(j<=space) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
			}
//			part2
			
			for(int j=mid+1; j<=n+1; j++) {
				if(i==1 || j==n+1 && i<=mid ) {
					System.out.print("@ ");
				}else {
					System.out.print("  ");
				}
			}
			
//			part3
			for(int j=n+2; j<=2*n-1; j++) {
				if(i<=mid || j<sst || j>est) {
					System.out.print("  ");
				}else {
					System.out.print("* ");
				}
			}
			
////			part4
//			for(int j=2n; j<=5n/2;j++) {
//				
//			}
//			for(int j=2n; j<=5n/2; j++) {
//				if(j<=space) {
//					System.out.print("  ");
//				}else {
//					System.out.print("* ");
//				}
//			}
//			
////			part5
//			for(int j=2n+mid; j<=3n; j++) {
//				
//			}
			
			if(i<mid) {
				space --;
			}else {
				space ++;
			}
		System.out.println();
		}
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num : ");
		int n = sc.nextInt();
		printPattern(n);
	}

}
