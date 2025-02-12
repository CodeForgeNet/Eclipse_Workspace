package classAssign.Array;

import java.util.Scanner;

public class FixedLength {
	
	public static void len(String[] s) {
		for(int i=0; i<s.length; i++) {
			if(s[i].length()==5) {
				System.out.println(s[i]);
			}
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of Array:");
		int l = sc.nextInt();
		String[] s = new String[l];
		
		for(int i=0; i<l; i++) {
			System.out.print("Enter"+(i+1)+"name : ");
			s[i] = sc.next();
		}
		
		len(s);
		sc.close();
	}
	
}
