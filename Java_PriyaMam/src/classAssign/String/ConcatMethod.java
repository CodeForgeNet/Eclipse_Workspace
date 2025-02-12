package classAssign.String;

import java.util.Scanner;

public class ConcatMethod {
	
	public static String concatt(String st1 , String st2) {
		
		return st1+st2;
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string1 : ");
		String str1 = sc.next();
		
		System.out.println("Enter string2 : ");
		String str2 = sc.next();
		
		String stringg = concatt(str1, str2);
		
		System.out.println(stringg);
		
		sc.close();
	}
	
}
