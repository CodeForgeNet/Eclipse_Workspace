package numberBasedProgram;

import java.util.Scanner;

/*
 538 => ?
 */

public class Deci_to_Hexadeci {
	
	public static void getHexa (int n) {
		String hex = "";
		while(n>0) {
			int rem = n%16;
			if(rem>=0 && rem<=9) {
				hex = rem +hex;
			}else {
				hex = (char)(rem+87)+hex;
			}
			
			n/=16;
		}
		System.out.println("Octal value is : "+hex);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a binary no.");
		int n = sc.nextInt();
		getHexa(n);
		sc.close();
	}
}
