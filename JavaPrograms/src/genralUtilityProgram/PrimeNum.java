package genralUtilityProgram;

import java.util.Scanner;

public class PrimeNum {

	public static boolean checkPrime(int a) {

		if (a <= 1) {
			return false;
		} else if (a != 2 && a % 2 == 0) {
			return false;
		} else {
			for (int i = 2; i <= a; i++) {
				if (a % i == 0) {
					return false;
				}
			}
			return true;

		}

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n = sc.nextInt();

		System.out.println(checkPrime(n));
		sc.close();
	}

}
