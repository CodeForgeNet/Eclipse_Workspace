package practice.numBasedProg;

import java.util.Scanner;

public class AutomorphicRange {

	public static boolean checkAutomorphic(int n) {
		int sqr = n * n;
		while (n > 0) {

			if (sqr % 10 != n % 10) {
				return false;
			}
			sqr /= 10;
			n /= 10;
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number 1: ");
		int n1 = sc.nextInt();
		System.out.print("Enter number 2: ");
		int n2 = sc.nextInt();
		int ctAM = 0;

		for (int i = n1; i <= n2; i++) {
			if (checkAutomorphic(i)) {
				System.out.println(i + " is automorphic");
				ctAM++;
			}
		}
		System.out.println("Total Automorphic is : " + ctAM);
	}

}
