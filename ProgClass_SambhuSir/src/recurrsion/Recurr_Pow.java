package recurrsion;

import java.util.Scanner;

public class Recurr_Pow {
	
	public static int pow(int b, int p) {
		if (p==0) {
			return 1;
		}else {
		return b * pow(b, p-1);
			
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter base : ");
		System.out.println("Enter power : ");
		int b = scanner.nextInt();
		int p = scanner.nextInt();
		System.out.println(pow(b,p));
		
		scanner.close();
	}
	
}
