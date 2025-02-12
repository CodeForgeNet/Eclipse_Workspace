package com.BasicsCal;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
//		Q. WAJP to reverse a number.
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your number:- ");
		int num = sc.nextInt();
		
		while(num!=0) {
			int res = num%10;
			System.out.print(res);
			num /=10;
		}
		sc.close();
	}

}
