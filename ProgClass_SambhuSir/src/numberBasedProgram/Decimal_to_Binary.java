package numberBasedProgram;

import java.util.Scanner;

/*
 53 => 110101
 */

public class Decimal_to_Binary {
	
	public static void getBinary(int n) {
		String bin = "";
		while(n>0) {
			int rem = n%2;
//			first we add remainder ,bcoz last value add first.
			bin = rem + bin;
			n/=2;
		}
		System.out.println("Binary value is : "+bin);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary no.");
		int n= sc.nextInt();
		getBinary(n);
		sc.close();
	}
}
