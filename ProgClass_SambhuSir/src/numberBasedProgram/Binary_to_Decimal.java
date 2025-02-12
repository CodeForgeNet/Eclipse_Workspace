package numberBasedProgram;

import java.util.Scanner;

/*
1011 => 11
1201 => not a valid binary no.

ex=> (1011)base2 => (11)base10
1*2^3  +  0*2^2  +  1*2^1  +  1*2^0
 */

public class Binary_to_Decimal {
	
	public static void getDecimal(int n) {
		int sum =0; int twomul = 1;
		while(n>0) {
			int rem = n%10;
			if(rem==0 || rem==1) {
				sum = sum+rem*twomul;
			}else {
				System.out.println("The no is not a valid binary number");
				return;
			}
			twomul*=2;
			n/=10;
		}
		System.out.println("Decimal value is : "+sum);
	}
	
	//2nd way by using String
//	public static void getDecimal(String s) {
//		
//		for(int i=s.length()-1; i>0; i--) {
//			char ch = s.charAt(i);
//			
//			
//		}
//		
//	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary no.");
		int n= sc.nextInt();
//		getDecimal(n);
		sc.close();
	}
	
}
