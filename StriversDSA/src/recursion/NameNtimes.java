package recursion;

import java.util.Scanner;

public class NameNtimes {
	public static void f(int i,int n) {
		if(i>n) return;
		
		System.out.println("Karan");
		f(i+1,n);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. : ");
		int n = sc.nextInt();
		f(1,n);
		sc.close();
	}
}
