package string;

import java.util.Scanner;

// print index and char of first no repeating char in string.

public class NonRepeating {
	
	public static String getCharacter(String s1) {
		int[] p = new int[256];
		for(int i=0; i<s1.length(); i++) {
			p[s1.charAt(i)]++;
		}
		for(int i=0; i<s1.length(); i++) {
			char x = s1.charAt(i);
			if(p[x]==1) {
				System.out.println();
				return x+"is 1st non repeating char at  index :"+i;
			}
		}
		return "There is no non-rep char";
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : ");
		String s1 = sc.next();
		getCharacter(s1);
		sc.close();
	}
}
