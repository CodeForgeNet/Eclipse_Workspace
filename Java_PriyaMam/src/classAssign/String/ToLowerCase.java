package classAssign.String;

import java.util.Scanner;

public class ToLowerCase {
	public static String toLowerCase(String str) {
		String string = "";
		for(int i=0; i<str.length(); i++) {
			char ch = str.charAt(i);
			if(ch>='A' && ch<='Z') {
				ch = (char)(ch+32);
			}
			string+=ch;
		}
		return string;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String : ");
		String str = sc.next();
		
		System.out.println(toLowerCase(str));
		
		sc.close();
	}
}
