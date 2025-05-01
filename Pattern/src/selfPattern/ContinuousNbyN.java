package selfPattern;

import java.util.Scanner;

//patt-6
//1  2  3  4  5
//6  7  8  9  10
//11 12 13 14 15
//16 17 18 19 20
//21 22 23 24 25

public class ContinuousNbyN {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter numerical value: ");
		int n = sc.nextInt();
		int k=1;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				System.out.printf("%2d",k);
				k++;
			}
			System.out.println();
		}
		sc.close();
	}
}
