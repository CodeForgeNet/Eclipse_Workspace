package com.SelfPattern;

import java.util.Scanner;

public class DiffPyramid {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num : ");
		int n = sc.nextInt();
		
		for(int i=1;i<=n; i++) {
			
			for(int j=1; j<=n; j++) {
				if(i+j>=n+1) {
					System.out.print("*   ");
				}else {
					System.out.print("  ");
				}	
			}
			System.out.println();
		}
//		
		
//		2nd method
		
//		int space = n-1; int star =1;
//		
//		for(int i=1;i<=n;i++) {
//				for(int j=1;j<=space;j++) {
//					System.out.print("  ");
//				}
//				for(int j=1;j<=star;j++) {
//					System.out.print("*   ");
//				}
//				space--; star++;
//			System.out.println();
//		}
		
		
		sc.close();
	}

}
