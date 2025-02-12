package genralUtilityProgram;

import java.util.Scanner;

public class LargestAmongNdig {
	
	public static int maxNum(int[] a) {
		
		int max = 0;
		for(int i=0; i<a.length; i++) {
			if(a[i]>max) {
				max=a[i];
			}
		}
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter no. of data you want to enter : ");
		int n = sc.nextInt();
		
		int[] a = new int[n];
		
		for(int i=0; i<n; i++) {
			System.out.println("Enter "+(i+1)+" number: ");
			a[i] = sc.nextInt();
		}
		
		
		System.out.println("Max number is : "+maxNum(a));
		
		sc.close();
	}
}
