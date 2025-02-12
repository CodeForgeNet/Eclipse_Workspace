package array;

import java.util.Scanner;

public class Sum_avg {
	
	public static void getSumAvg(int[] d) {
		int sum=0;
		for(int p:d) {
			sum+=p;
		}
		System.out.println("Total sum = "+sum);
		System.out.println("Avg is : "+sum/d.length);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no. of element : ");
		int n = sc.nextInt();
		
		int[] d = new int[n];
		
		for(int i=0; i<d.length; i++) {
			d[i]=sc.nextInt();
		}
		
		getSumAvg(d);
		
	}

}
