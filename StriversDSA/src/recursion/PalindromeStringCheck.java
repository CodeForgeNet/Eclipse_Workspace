package recursion;

import java.util.Scanner;

// TC = O(n/2)

public class PalindromeStringCheck {
	
	public static boolean checkPalin(String str,int i) {
		int n= str.length();
		if(i==n/2) return true;
		
		if( str.charAt(i) != str.charAt(n-i-1) ) return false;
		return checkPalin(str,i+1) ;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.next().toLowerCase();
		System.out.println( checkPalin(str,0));
		sc.close();
	}
}
