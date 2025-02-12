package com.loopingStatement;

import java.util.Scanner;

public class PrintCahrInStr {
//	Q. WAJP to read a string from user and print all the characters present in the string in reverse order.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String:- ");
		
		String str= sc.nextLine();
		int start=0;
		int end=str.length()-1;
		
		while(start < str.length()) {
			
			System.out.println(str.charAt(end-start));
			start++;
		}
		
		
		
		
		
		sc.close();
	}

}
