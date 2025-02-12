package array;

import java.util.Scanner;

public class ReverseArr {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no. of element : ");
		int n = sc.nextInt();
		
		int[] d = new int[n];
		
		for(int i=0; i<d.length; i++) {
			d[i]=sc.nextInt();
		}
		
		for(int i=d.length-1; i>=0; i--) {
			System.out.println(d[i]+" ");
		}

	}
}
