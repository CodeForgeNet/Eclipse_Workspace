package com.pattern;

import java.util.Scanner;

public class RtTgl_char_SameCol {
	public static void printPattern(int n) {
		for(int i=1;i<=n; i++) {
			char x='A';
			for(int j=1; j<=i; j++) {
				System.out.print(x+" ");
				x++;
			}
			System.out.println();
		}
		
	}

public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter num:- ");
	int n = sc.nextInt();
	
	printPattern(n);
	
	sc.close();
}

}
