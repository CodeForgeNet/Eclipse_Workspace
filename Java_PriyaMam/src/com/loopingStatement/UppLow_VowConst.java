package com.loopingStatement;

import java.util.Scanner;

public class UppLow_VowConst {
//	Q. WAJP to find out the count of uppercase and lowercase alphabets, vowels and consonant. 

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter your full name:- ");
		
		String str= sc.nextLine();
		
		int i = 0;
		int countUC=0;
		int countLC=0;
		int countV=0;
		int countC=0;
		
		while (i<str.length()) {
			
			char ch= str.charAt(i);
			if (ch>='A' && ch<='Z') {
				countUC++;
				if (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U' ) {
					countV++;
				}else {
					countC++;
				}
			}else if (ch>='a' && ch<='z') {
				countLC++;
				if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ) {
					countV++;
				}else {
					countC++;
				}
			}
			i++;
		}
		System.out.println("UPPER CASE :- "+ countUC);
		System.out.println("lower case :- "+ countLC);
		System.out.println("Vowels :- "+ countV);
		System.out.println("Consonant :- "+ countC);
		
		
		
		sc.close();

	}

}
