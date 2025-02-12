package numberBasedProgram;

import java.util.Scanner;

public class Permutation {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = sc.nextInt();
		System.out.println("Enter r : ");
		int r = sc.nextInt();
		
		if(n>=r) {
			System.out.println("Total ways to arrange are : "+getPermut(n,r));
		}else {
			System.out.println("Permutation is not possible");
		}
		
		sc.close();
		
	}
	
	public static int getPermut(int n, int r) {
		int perm = 1;
		for ( int i=0; i<r; i++) {
			perm = perm*(n-i);
		}
		return perm;
	}
	

}
