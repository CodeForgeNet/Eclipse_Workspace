package com.Exception;

import java.util.Scanner;

public class Finarllly {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.print("Enter number : ");
			int n = sc.nextInt();
			System.out.println(n);
		} catch (Exception e) {
			System.out.println("Input Mismatch Exception");
		} finally {
			sc.next();
		}
	}
}
