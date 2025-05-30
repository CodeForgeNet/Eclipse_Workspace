package numberBasedProgram;

import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the num : ");
		int n = sc.nextInt();
		
		getFactorial(n);
		
		sc.close();
	}
	
	public static void getFactorial(int n) {
		BigInteger fact = new BigInteger("1");
		for(int i=1; i<=n; i++) {
			
			BigInteger p = new BigInteger(i+"");
			fact = fact.multiply(p);
			
		}
		System.out.println(n+"! = "+fact);
	}

}
