package com.SelfPattern;

import java.util.Scanner;

public class DiamondInt {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter num : ");
		int n = sc.nextInt();
		
		int star =1;
		int space = n/2;
		int x = 1;
		String s1=" ";
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=space;j++) {
//				System.out.print("  ");
				System.out.printf("%4s",s1);
			}
			for(int j=1;j<=star;j++) {
//				System.out.print((char)x+" ");
				System.out.printf("%4d",x);
				x++;
			}
			if(i<n/2+1) {
				space--;
				star+=2;
			}else {
				space++;
				star-=2;
			}
			
			System.out.println();
		
		}
		sc.close();

	}

}
