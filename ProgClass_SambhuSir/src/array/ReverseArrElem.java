package array;

import java.util.Scanner;

public class ReverseArrElem {
	
	public static void getRev(int n) {
		int rev=0;
		while(n>0) {
			int rem = n%10;
			rev=10*rev+rem;
			n/=10;
		}
		System.out.println(rev+" ");
	}
	
	public static void getReverse(int[] d) {
		int ct =0;
		for(int num:d) {
			getRev(num);
		}
		System.out.println("Total even number is : "+ct);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no. of element : ");
		int n = sc.nextInt();
		
		int[] d = new int[n];
		
		for(int i=0; i<d.length; i++) {
			d[i]=sc.nextInt();
		}
		
		getReverse(d);

	}
}
