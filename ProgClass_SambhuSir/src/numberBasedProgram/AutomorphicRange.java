package numberBasedProgram;

import java.util.Scanner;

public class AutomorphicRange {
	
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
		System.out.println("Enter num1 : ");
		int n1 = sc.nextInt();
		System.out.println("Enter num2 : ");
		int n2 = sc.nextInt();
		
		int auCount = 0;
		
		for(int i=n1; i<=n2; i++) {
			if(isAutomorphic(i)) {
				System.out.println("It is Automorphic number ");
				auCount++;
			}
		}
		System.out.println("Total Automorphic is : "+auCount);
		
		sc.close();
	}

}
