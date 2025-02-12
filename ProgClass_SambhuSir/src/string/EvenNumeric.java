package string;

import java.util.Scanner;

//WAJP to take a String input and print sum of all the even numeric characters in the String.

public class EvenNumeric {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String s1 = sc.nextLine();
		
		int sum = 0;
		for(int i=0; i<s1.length(); i++) {
			char ch = s1.charAt(i);
			if(ch>='0' && ch<='9' && ch%2==0) {
				sum = sum+(ch-48);
			}
		}
		System.out.println(sum);
		sc.close();
	}
}
