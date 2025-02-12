package practice.numBasedProg;

import java.util.Scanner;

public class Automorphic {
	
	public static boolean checkAutomorphic(int n) {
		int sqr = n*n;
		while(n>0) {
			if(sqr %10 != n%10) {
				return false;
			}
			sqr/=10;
			n/=10;
		}
		return true;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number to find it is automorphic or not :");
		int num = sc.nextInt();
		if(checkAutomorphic(num)) {
			System.out.println("It is automorphic ");
		}else {
			System.out.println("It is not automorphic");
		}
	}
	

}
