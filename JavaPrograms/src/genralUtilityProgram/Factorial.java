package genralUtilityProgram;

import java.util.Scanner;

public class Factorial {
	
	public static void factorial(int n) {
		int fact=1;
		for(int i=1; i<=n; i++) {
			fact*=i;
		}
		System.out.println("Factorial of "+n+" is "+fact);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();
		
		factorial(n);
		sc.close();
	}

}
