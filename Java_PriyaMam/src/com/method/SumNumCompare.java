package com.method;

import java.util.Scanner;

public class SumNumCompare {
		public static boolean equal(int num) {
			if(SumNumEqual.sum(45)==num) {
				return true;
			}
			return false;
		}


	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number:- ");
		int num = scanner.nextInt();
		
	System.out.println(equal(145));
	}

}
