package com.SelfPattern;

import java.util.Scanner;

public class OppDiffPyramid {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num : ");
		int n = sc.nextInt();
		
		int space = 0; int star =n;

		for(int i=1;i<=n;i++) {
				for(int j=1;j<=space;j++) {
					System.out.print("  ");
				}
				for(int j=1;j<=star;j++) {
					System.out.print("*   ");
				}
				space++; star--;
			System.out.println();
		}
		sc.close();
	}

}
