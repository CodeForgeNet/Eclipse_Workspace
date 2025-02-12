package numberBasedProgram;

import java.util.Scanner;

/*
214 => 110
 294 => not a valid no.
 
 ex => (214)base8 => (110)base10
 
 */

public class Octal_to_Decimal {
	public static void getDecimal(int n) {
		int sum =0; int eightmul = 1;
		while(n>0) {
			int rem = n%10;
			if(rem>=0 && rem<8) {
				sum = sum+rem*eightmul;
			}else {
				System.out.println("The no is not a valid octal number");
				return;
			}
			eightmul*=8;
			n/=10;
		}
		
		System.out.println("Decimal value is : "+sum);
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a octal no.");
		int n= sc.nextInt();
		getDecimal(n);
		sc.close();
	}
}
