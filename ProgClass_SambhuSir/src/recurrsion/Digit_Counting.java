package recurrsion;

import java.util.Scanner;

public class Digit_Counting {

	public static int digit(int x) {
		if (x > 0) {
			return 1 + digit(x / 10);
		} else {
			return 0;
		}
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter num : ");
		int a = scanner.nextInt();
		System.out.println(digit(a));
		
		scanner.close();
	}
}
