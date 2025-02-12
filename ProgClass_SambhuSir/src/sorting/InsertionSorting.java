package sorting;

import java.util.Scanner;

public class InsertionSorting {
	
	public static int[] sort(int[] a) {
		for(int i=1; i<a.length; i++) {
			int j = i-1;
			int key = a[i];
			while(j>=0 && a[j]>key) {
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
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
		
		int[] b=sort(a);
		for(int p:b) {
			System.out.print(p+" ");
		}
		
		sc.close();

	}

}
