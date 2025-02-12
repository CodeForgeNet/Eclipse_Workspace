package bitwise;

import java.util.Scanner;

public class Palindrome_NOreversing {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number : ");
		int n = sc.nextInt();
		
		if(checkPalin(n)) {
			System.out.println("Palin");
		}else {
			System.out.println("not palin");
		}
		
		
		sc.close();
	}
	
	
	
	
	public static boolean checkPalin(int n) {
		int p=n;
		int count= getCount(n); int x = count;
		int i=1;
		while(i<=x/2) {
			int r = p%10;
			int l = (int)(n/Math.pow(10, count-1))%10;
			if(l!=r) {
				return false;
			}
			
			p/=10;
		count--;
		i++;
		}
		return true;
	}
	
	
	
	
	public static int getCount(int n) {
		int count = 0;
		while(n>0) {
			count++;
			n/=10;
			
		}
		return count;
	}
}
