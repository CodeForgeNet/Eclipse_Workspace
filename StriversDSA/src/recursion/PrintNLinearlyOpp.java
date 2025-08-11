package recursion;

import java.util.Scanner;

public class PrintNLinearlyOpp {
	
//	public static void f(int i,int n) {
//		if(i<1) return;
//		
//		System.out.println(i);
//		f(i-1,n);
//	}
//
//	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter no. : ");
//		int n = sc.nextInt();
//		f(n,n);
//
//	}
	
	
//	or
//	Without using i-1, instead i+1;
	
	
	public static void f(int i,int n) {
		if(i>n) return;
		
		f(i+1,n);
		System.out.println(i);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. : ");
		int n = sc.nextInt();
		f(1,n);
		sc.close();
	}
	
	

}
