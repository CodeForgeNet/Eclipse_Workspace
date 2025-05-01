package selfPattern;

import java.util.Scanner;

public class SqrDigRowColSameDecrease {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter numerical value: ");
		int n = sc.nextInt();
		
		// Same row
//		for(int i=n; i>0; i--) { //Row
//			for(int j=1; j<n; j++) { //Column
//				System.out.print(i+" ");
//			}
//			System.out.println();
//		}
		
		//Same Column
		for(int i=n; i>0; i--) {
			for(int j=n; j>0; j--) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
}
