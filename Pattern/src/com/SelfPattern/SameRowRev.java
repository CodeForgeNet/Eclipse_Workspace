package com.SelfPattern;

import java.util.Scanner;

public class SameRowRev {

	public static void sameRowReverse(int n) {
		for (int i = n; i > 0; i--) {
			for (int j = 0; j < n; j++) {
				System.out.print(i + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num ");
		int n = sc.nextInt();
		sameRowReverse(n);
	}

}
