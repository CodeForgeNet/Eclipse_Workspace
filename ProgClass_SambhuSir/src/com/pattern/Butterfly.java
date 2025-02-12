package com.pattern;

import java.util.Scanner;

public class Butterfly {
	public static void printPattern(int n) {
		int lStar =1;
		int rStar = n;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=n;j++) {
			
				if(j<=lStar || j>=rStar) {
					System.out.print("* ");
				}else 
					System.out.print("  ");
			}
			if(i<n/2+1) {
				lStar++;
				rStar--;
			}else {
				lStar--;
				rStar++;
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
