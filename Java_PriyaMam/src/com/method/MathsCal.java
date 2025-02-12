//package com.method;
//
//import java.util.Scanner;
//
//public class MathsCal {
//	
//	public static float sum(int num) {
//		int sum=0;
//		sum+=num;
//		return sum;
//	}
//	public static float sub(int num) {
//		int sub=0;
//		sub-=num;
//		return sub;
//	}
//	public static float mul(int num) {
//		int mul=1;
//		mul+=num;
//		return mul;
//	}
//	public static float div(int num) {
//		int div=0;
//		div/=num;
//		return div;
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.print("1st num:- ");
//		float n1=sc.nextFloat();
//		
//		char sign;
//		do {
//			System.out.print("Enter sign:- ");
//			sign = sc.next().charAt(0);
//			
//			if (sign !='=') {
//				
//				System.out.println("Enter num:-");
//				float n2 = sc.nextFloat();
//				
//				if (sign=='+') {
//					sum(n2);
//					
//				}else if (sign=='-') {
//					sub(n2);
//					
//				}else if (sign=='*') {
//					mul(n2);
//					
//				}else if (sign=='/') {
//					div(sign);
//					
//				}else {
//					System.out.println("Exit");
//				}
//				
//				
//			}
//			
//			
//			
//		} while (sign!='=');
//
//	}
//
//}
