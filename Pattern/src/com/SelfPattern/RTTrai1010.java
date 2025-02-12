package com.SelfPattern;

import java.util.Scanner;

public class RTTrai1010 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num : ");
		int n = sc.nextInt();
		
		int star = n;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= star; j++) {
				System.out.print(i%2+" ");
			}
			star--;
			System.out.println();
		}
		
		sc.close();

	}

}
