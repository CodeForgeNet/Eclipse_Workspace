package string;

import java.util.Scanner;

// WAJp to take a string input and replace all the space characters from _ in the string.

public class ReplaceChar {

	public static void getResultString(String s1) {
		String result ="";
		for(int i=0; i<s1.length(); i++) {
			if(s1.charAt(i)!=' ') {
				result = result + s1.charAt(i);
			}else {
					result = result+' ';
				}
			}
		System.out.println(result);
		}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string : ");
		String s1 = sc.nextLine();
		getResultString(s1);
	}
}
