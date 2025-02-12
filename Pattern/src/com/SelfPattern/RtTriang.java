package com.SelfPattern;

import java.util.Scanner;

public class RtTriang {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num : ");
		int n = sc.nextInt();

//		3 for loop format : 
//		for (int i = 1; i <= n; i++) {
//			for (int j = 1; j <= space; j++) {
////				space
//			}
//			for (int j = 1; j <= star; j++) {
////				star
//			}
//
//		}

		int star = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= star; j++) {
				System.out.print("* ");
			}
			star++;
			System.out.println();
		}
		
		sc.close();

	}

}
