package selfPattern;

import java.util.Scanner;

public class SqrDigRowColSameIncrease {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter numrical value :  ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n;i++) {
			for(int j=1; j<=n;j++) {
//				System.out.print(i+" "); //same row print i.
				System.out.print(j+" "); //same column print j.
			}
			System.out.println();
		}
		
	}
}
