package com.method;

import java.util.Scanner;

public class CharCheckInString {

	public static int place(String str, char ch) {
		
		for (int i=0; i < str.length(); i++) {
			if (str.charAt(i) == ch) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a String:- ");
		String str = sc.next();

		System.out.print("Enter a Character:- ");
		char ch = sc.next().charAt(0);

		System.out.println(place(str, ch));

		sc.close();
	}

}
