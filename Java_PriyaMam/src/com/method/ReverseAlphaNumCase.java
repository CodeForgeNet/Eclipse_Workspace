package com.method;

import java.util.Scanner;

public class ReverseAlphaNumCase {
	
	public static void name(String str) {
		for(int i=0; i<str.length(); i++) {
			
			char ch= str.charAt(i);
			
			if(ch>='a' && ch<='z') {
				int res1 = ch-32;
				System.out.print((char)res1);
				
			}else if (ch>='A' && ch<='Z') {
				int res2 = ch+32;
				System.out.print((char)res2);
				
			}else {
				System.out.print(ch);
			}
			
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter String:- ");
		String string = scanner.nextLine();
		
		name(string);

		scanner.close();
	}

}
