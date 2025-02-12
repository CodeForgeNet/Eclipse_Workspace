package numberBasedProgram;

import java.util.Scanner;

public class Automorphic {
//	WAJP to take user input and print whether the number is Automorphic number or not.
	
	public static boolean isAutomorphic(int n) {
		
		int sqr = n*n;
		while(n>0) {
			if(sqr%10!=n%10) {
				return false;
			}
			sqr/=10;
			n/=10;
			
		}
		return true;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : ");
		int num = sc.nextInt();
		
		if(isAutomorphic(num)) {
			System.out.println("It is Automorphic");
		}else {
			System.out.println("It is not Automorphic");
		}
		sc.close();
	}

}
