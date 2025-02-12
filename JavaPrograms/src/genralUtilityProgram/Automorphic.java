package genralUtilityProgram;

import java.util.Scanner;

public class Automorphic {
	
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
		System.out.print("Enter number: ");
		int n = sc.nextInt();
		
		if(isAutomorphic(n)) {
			System.out.println("It is automorphic");
		}else {			
			System.out.println("It is not automorphic");
		}
		
		sc.close();
	}

}
