package classAssign.String;

import java.util.Scanner;

public class Contains {
	
	public static boolean contains(String str, char ch) {
		String st = str.toLowerCase();
		for(int i=0; i<st.length(); i++) {
			if(st.charAt(i)==ch) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter string : ");
		String str = sc.next();
		
		System.out.print("Enter char : ");
		char ch = sc.next().charAt(0);
		
		System.out.println(contains(str,ch));
		
		sc.close();
	}

}
