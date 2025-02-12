package classAssign.String;

import java.util.Scanner;

public class ToUpperCase {
	public static String toUpperCase(String str) {
		String string = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>='a' && ch<='z') {
				ch=(char)(ch-32);
			}
			string +=ch;
		}
		return string;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		
		System.out.println(toUpperCase(str));
		
		sc.close();
	}
	
}
