package classAssign.Array;

import java.util.Scanner;

public class VowelArrName {
	
	public static void q (String[] s) {
		
		for(int i=0; i<s.length; i++) {
			char ch = s[i].charAt(0);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
				System.out.println(s[i]);
				
			}
		}
		
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String[] s = new String[5];
		for(int i=0; i<s.length; i++) {
			System.out.print("Enter "+(i+1)+"name : ");
			s[i]=sc.next();
		}
		
		q(s);
		
		
	}

}
