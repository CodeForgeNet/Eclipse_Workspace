package array;

// Important Question

import java.util.Scanner;

public class EvenOrOddNoIfElse {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num : ");
		int n = sc.nextInt();
	
		String[] p = {"Even","Odd"};
		System.out.println(p[n%2]);
		
		sc.close();
		

	}
}
