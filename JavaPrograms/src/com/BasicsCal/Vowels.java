package com.BasicsCal;

import java.util.Scanner;

public class Vowels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Words to check its first Char is \"Vowel\" or not :- ");
		String s = sc.next();
		char vowel1 = 'A', vowel2 = 'E', vowel3 = 'I', vowel4 = 'O', vowel5 = 'U' ;
		String result = s.charAt(0)==vowel1 || s.charAt(0)==vowel2 || s.charAt(0)==vowel3  || s.charAt(0)==vowel4 || s.charAt(0)==vowel5  ? "\nFirst character of \""+s+"\" is :- Vowel\n" : "\nFirst character of \"" +s+"\" is :- Not Vowel\n";
		
		System.out.println(result);
		
		sc.close();
	}

}
