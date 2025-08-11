package recursion;

import java.util.Scanner;

public class SumFirstNno {
	
//	Parameter
	
//	public static void f(int i, int sum) {
//		if(i<1) {
//			System.out.println(sum);
//			return;
//		}
//		f(i-1,sum+i);
//	}
	
	
	
	
//	Functional
	
	public static int f(int n) {
		if(n==0) {
			return 0;
		}
		return n+f(n-1);
	}
	
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter no. : ");
		int n = sc.nextInt();
		
//		Parameter
//		f(n,0);
		
//		Functional
		System.out.println(f(n));
	}
}
