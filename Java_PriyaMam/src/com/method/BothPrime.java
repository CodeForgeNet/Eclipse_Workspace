package com.method;

import java.util.Scanner;

public class BothPrime {

	public static int num(int n) {
		int count = 1;

		if (n <= 0) {
			return 2;
		} else if (n != 2 && n % 2 == 0) {
			return 2;
		} else {
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					count++;
				}
			}
		}
		return count;
	}

	public static boolean prime(int number1, int number2) {
		if (num(number1) <= 1 && num(number2) <= 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("First Number1:- ");
		int number1 = sc.nextInt();

		System.out.print("First Number2:- ");
		int number2 = sc.nextInt();

		System.out.println("\nStart Main");

		System.out.println(prime(number1, number2));

		System.out.println("End Main");

		sc.close();
	}

}
