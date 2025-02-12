package com.loopingStatement;

import java.util.Scanner;

public class alphaNum_sum {
//	Q. WAJP to read a alphanumeric string and find out sum of digits present in alphanumeric string.

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter alphnumeric value :- ");
		String str = sc.nextLine();
		
		int sum = 0;
		
		for(int i=0; i<str.length(); i++) {
			int ch = str.charAt(i);
			if(ch>='0' && ch<='9') {
				ch = ch -'0';
				sum += ch;
			}
		}
		System.out.println(sum);
		
		sc.close();
	}

}


