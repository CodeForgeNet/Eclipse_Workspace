package string;

import java.util.Scanner;

//WAJP to take a String input and check whether the string is a palindrome string or not(without reversing).

public class PalindromeString {

	// Way 01 :By doing Reverse
	public static boolean checkPalindrome1(String s1) {
		String rev = "";
		for (int i = 0; i < s1.length(); i++) {
			rev = s1.charAt(i) + rev;
		}
		return s1.equalsIgnoreCase(rev); // this method ignore the case of the char .
	}

//	Way 02 : without reverse, by comparing first half to last half.
	public static boolean checkPalindrome2(String s1) {
		int len = s1.length();
		for (int i = 0; i < len / 2; i++) {
			if (s1.charAt(i) != s1.charAt(len - i - 1)) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String s1 = sc.nextLine();
		if (checkPalindrome2(s1)) {
			System.out.println("The string entered is palindrome.");
		} else {
			System.out.println("The string entered is NOT a palindrome.");
		}
		sc.close();
	}
}
