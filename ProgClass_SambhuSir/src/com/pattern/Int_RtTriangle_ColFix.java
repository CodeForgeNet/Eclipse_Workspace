package com.pattern;

import java.util.Scanner;

public class Int_RtTriangle_ColFix {
	public static void printPattern(int n) {
		for(int i=1;i<=n; i++) {
//			int x=1; or
			for(int j=1; j<=i; j++) {
				System.out.print(j+" ");
//				x++;
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
