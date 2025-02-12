package com.SelfPattern;

import java.util.Scanner;

public class PatMixup {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int n= sc.nextInt();
		
		for(int i=1;i<=n; i++) {
//			if n is odd then its mid pt is available.
			for(int j=1; j<=n; j++) {
				if(i==1 || j==1 || i==n || j==n||(n+1)/2==i || (n+1)/2 ==j || i==j || i+j==n+1 ) {
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
