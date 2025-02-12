package com.loopingStatement;

import java.util.Scanner;

public class Count_factorsOfNum {

	public static void main(String[] args) {
//		Q. WAJP to find out the the count of the factors of number enter by user.
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter your number to print its factors:- ");
		int num = scanner.nextInt();
		
		int initial = 1;
		int count=0;
		
		while(initial<=num) {
			if (num%initial==0) {
				count++;
			}
			initial++;
		}
		
		System.out.println(count);
		
		scanner.close();

	}

}
