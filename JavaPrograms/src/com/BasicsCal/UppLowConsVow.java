package com.BasicsCal;

import java.util.Scanner;

public class UppLowConsVow {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Your string:- ");
		String str = sc.nextLine();
		
		int countUC = 0;
		int countLC = 0;
		int countV = 0;
		int countC = 0;
		
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
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
		}
		System.out.println("UPPER CASE :- "+countUC);
		System.out.println("lower case :- "+countLC);
		System.out.println("Vowels :- "+countV);
		System.out.println("Consonant :- "+countC);
		
		
		sc.close();
	}

}
