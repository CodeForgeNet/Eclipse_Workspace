package com.BasicsCal;

import java.util.Scanner;

public class AlphaNumeric {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter alphanumeric string:- ");
		String str= sc.next();
		
		int i =0;
		int sum= 0;
		
		while (i<str.length()) {
			char ch=str.charAt(i);
			if (ch>='0' && ch<='9') {
				int num = ch-'0';
				sum=sum+num;
			}
			i++;
		}
		System.out.println(sum);
		
		sc.close();

	}

}
//design class to achieve constructor chaining for 1.vehicle 2. student 3. animal 