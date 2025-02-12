package numberBasedProgram;

import java.util.Scanner;

/*
 591 => ?
 */

public class Decimal_to_Octal {
	
	public static void getOctal (int n) {
		String oct = "";
		while(n>0) {
			int rem = n%8;
			oct = rem +oct;
			n/=8;
		}
		System.out.println("Octal value is : "+oct);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary no.");
		int n= sc.nextInt();
		getOctal(n);
		sc.close();
	}
}
