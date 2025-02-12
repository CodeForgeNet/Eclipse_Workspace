package sorting;

import java.util.Scanner;

public class RotateDig {
	
	public static int[] rotateRt(int[] a, int k) {
		for(int i=1; i<=k; i++) {
			int last = a[a.length-k];
			for(int j=a.length-k; j>=0; j-- ) {
				a[j+1]=a[j];
			}
			a[0]=last;
		}
		return a;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array : ");
		int n= sc.nextInt();
		int[] a= new int[n];
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.print("Enter positions:");
		int p=sc.nextInt();
		
		int[] b = rotateRt(a,p);
		for(int x:b) {
			System.out.println(x);
		}
		
		
		sc.close();

	}
}
