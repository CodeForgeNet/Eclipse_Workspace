package array;

import java.util.Scanner;

public class EvenNoCharString {
	public static void getEvenChar(String[] d) {
		int ct =0;
		for(String k :d) {
			if(k.length()%2==0) {
				System.out.println("Even char string is "+k);
				ct++;
			}
		}
		System.out.println(ct);
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("no. of element : ");
		int n = sc.nextInt();
		
		String[] d = new String[n];
		
		sc.nextLine();
		
		for(int i=0; i<d.length; i++) {
			d[i]=sc.nextLine();
		}
		
		getEvenChar(d);

	}
}
