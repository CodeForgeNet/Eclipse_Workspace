package array;

import java.util.Scanner;

public class PrimeNumCtPrnt {
	
	public static boolean checkPrime(int n) {
		for(int i=2; i<=n/2; i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
	}
	
	public static void getPrime(int[] d) {
		int ct =0;
		for(int num:d) {
			if(checkPrime(num)) {
				System.out.println("Prime is "+num);
				ct++;
			}
		}
		System.out.println("Total prime number is : "+ct);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no. of element : ");
		int n = sc.nextInt();
		
		int[] d = new int[n];
		
		for(int i=0; i<d.length; i++) {
			d[i]=sc.nextInt();
		}
		
		getPrime(d);

	}
}
