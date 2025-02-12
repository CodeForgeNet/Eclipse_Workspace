package array;

import java.util.Scanner;

public class Big_Small_diff {
	
	public static void getBigSmall(int[] d) {
		int s=d[0];
		int b=d[0];
		for(int i=0; i<d.length; i++) {
			if(s>d[i]) {
				s=d[i];
			}
			if(b<d[i]) {
				b=d[i];
			}
		}
		
		System.out.println("Big = "+b);
		System.out.println("Small "+s);
		System.out.println("Diff is : "+(b-s));
	}
	
//	2nd way
//	int big = Integer.MIN_VALUE;
//	int small = Integer.MAX_VALUE;
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no. of element : ");
		int n = sc.nextInt();
		
		int[] d = new int[n];
		
		for(int i=0; i<d.length; i++) {
			d[i]=sc.nextInt();
		}
		
		getBigSmall(d);

	}
}
