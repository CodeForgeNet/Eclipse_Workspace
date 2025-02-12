package com.loopingStatement;

import java.util.Scanner;

public class FactorsOfNum {

	public static void main(String[] args) {
//		Q. WAJP to print the factors of a number enter by user.
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your number to print its factors:- ");
		int num = scanner.nextInt();
		int initial = 1;
		while(initial<=num) {
			if (num%initial==0) {
				System.out.println(initial);
			}
			initial++;
		}
		scanner.close();
	}

}
