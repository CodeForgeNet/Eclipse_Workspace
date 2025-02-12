package com.Method;

import java.util.Scanner;

public class Recursion {
	
	public static int sum (int s) {
		if(s>0) {
			return s + sum(s-1);
			
		}else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int result = sum(num);
		
		System.out.println(result);
		
		
		sc.close();
	}

}
