package selfPattern;

import java.util.Scanner;

//patt-6
//1  3  5  7  9
//11 13 15 17 19 
//21 23 25 27 29
//31 33 35 37 39
//41 43 45 47 49
public class ContinuousNbyNodd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter numerical value: ");
		int n = sc.nextInt();
		int k = 1;

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.printf("%2d ", k);
				k += 2;
			}
			System.out.println();
		}

		sc.close();
	}
//	pat -8 . This code also done for even by making k=2 

}
