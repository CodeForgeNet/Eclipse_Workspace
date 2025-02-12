package com.method;

import java.util.Scanner;

public class Input3Method {
	int a,b,c;
	
	public static void large(int a, int b, int c) {
		
		if(a>b && a>c) {
			System.out.println(a+" is largest");
		}else if(b>a && b>c) {
			System.out.println(b+" is largest");
		}else {
			System.out.println(c+ " is largest");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 number:- ");
		int x = sc.nextInt();
		int y = sc.nextInt();
		int z = sc.nextInt();
		
		large(x, y, z);
		
		
		
		sc.close();
	}
	
}