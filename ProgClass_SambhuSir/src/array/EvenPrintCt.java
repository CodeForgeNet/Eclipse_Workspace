package array;

import java.util.Scanner;

public class EvenPrintCt {
	public static void getEven(int[] d) {
		int ct =0;
		for(int num:d) {
			if(num%2==0) {
				ct++;
				System.out.println(num);
			}
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
		
		getEven(d);

	}
}
