package array;

import java.util.Scanner;

public class SwapTwoIndexVal {
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no. of element : ");
		int n = sc.nextInt();
		
		int[] d = new int[n];
		
		for(int i=0; i<d.length; i++) {
			d[i]=sc.nextInt();
		}
		
		System.out.println("Enter index1 to swap");
		int i1=sc.nextInt();
		System.out.println("Enter index2 to swap");
		int i2 = sc.nextInt();
		
		//1st way
//		int temp = d[i1];
//		d[i1]=d[i2];
//		d[i2]=temp;
//		
//		for(int k:d) {
//			System.out.println(k);
//		}
		
		//2nd way
		d[i1]=d[i1]+d[i2];
		d[i2]=d[i1]-d[i2];
		d[i1]=d[i1]-d[i2];
		for(int k:d) {
			System.out.println(k);
		}

	}
}
