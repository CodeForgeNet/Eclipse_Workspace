package com.method;

import java.util.Scanner;

public class VowelsCount {
	
	public static int VowelCount(String str) {
		int count = 0;
		for(int i=0;i<str.length();i++) {
			char ch= str.charAt(i);
			if(ch=='A' || ch=='E' || ch=='O' || ch=='I' || ch=='U' || ch=='a' || ch=='e' || ch=='o' || ch=='i' || ch=='u' ) {
				count ++;
			}
		}
		return count;
		
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String:- ");
		String str = sc.nextLine();
		
		System.out.println("Tota vowel is :- "+VowelCount(str));
		
		
		
		sc.close();
	}

}
