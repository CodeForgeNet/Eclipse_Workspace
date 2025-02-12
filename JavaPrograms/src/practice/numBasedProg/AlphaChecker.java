package practice.numBasedProg;

import java.util.Scanner;

public class AlphaChecker {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Char : ");
		char ch = sc.next().charAt(0);
		if(ch>='a' && ch<='z' || ch>='A' && ch<='Z') {
			System.out.println("Alphabet");
		}else {
			System.out.println("Not a alphabet ");
		}
		sc.close();
	}

}
