package com.SelfPattern;

import java.util.Scanner;

public class PatColmSame {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num");
		int n= sc.nextInt();
		for(int i=1; i<n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.print((i-1)%2+" ");
			}
			System.out.println();
		}
		sc.close();
	}

}
