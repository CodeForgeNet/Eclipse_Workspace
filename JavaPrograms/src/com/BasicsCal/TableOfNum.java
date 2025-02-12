package com.BasicsCal;

import java.util.Scanner;

public class TableOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number:- ");
		int num = sc.nextInt();
		
		for(int i=1; i<=10; i++) {
			int multi = num * i;
			System.out.println(multi);
		}
		sc.close();
	}

}
