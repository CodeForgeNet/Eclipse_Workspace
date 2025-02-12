package com.method;

import java.util.Scanner;

public class Uppercase {
	public static void upper(String s) {
//		BY USING PRE DEFINED METHOD.
//		s = s.toUpperCase();
//		System.out.println("In Upper Case:- "+s);
		
//		BY USER DEFINED METHOD
		for(int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			
			if(ch>='a' && ch<='z') {
				int val = ch-32;
				System.out.print((char)val);
			}else {
				System.out.print(ch);
			}
			
		}
		
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print(" Enter string:- ");
		String str = scanner.next();
		
		upper(str);
		
		scanner.close();
	}

}
