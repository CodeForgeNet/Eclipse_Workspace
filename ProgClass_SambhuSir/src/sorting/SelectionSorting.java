package sorting;

import java.util.Scanner;

public class SelectionSorting {
	
	public static int[] sort(int[] a) {
		for(int i=0; i<a.length-1; i++) {
			int min=a[i];
			int minIndex = i;
			for(int j=i+1; j<a.length; j++) {
				if(a[j]<min) {
					min=a[j];
					minIndex=j;
				}
			}
			a[minIndex]=a[i];
			a[i]=min;
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
