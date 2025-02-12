package com.loopingStatement;

import java.util.Scanner;

public class CountOf_Vowels {
//	Q. WAJP to read a student name from user and print the count of vowels present in the name.

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your full name:- ");
		
		String str = sc.nextLine();
		
		int i = 0;
		int countV=0;
		int countC=0;
		
		while (i<str.length()) {			
			char ch = str.charAt(i);
//			or
//			ch = Character.toLowerCase(ch);
			if (ch>='A' && ch<='Z' || ch>='a' && ch<='z' ) {							
				if ((ch== 'a' || ch== 'e' || ch == 'i' || ch== 'o' || ch== 'u' ) || (ch== 'A' || ch== 'E' || ch == 'I' || ch== 'O' || ch== 'U' ))  {
					countV++;
					
				}else {
					countC++;
				}
			}
			
			i++;
		}
		System.out.println(countV);
		System.out.println(countC);
				
		sc.close();
	}

}
