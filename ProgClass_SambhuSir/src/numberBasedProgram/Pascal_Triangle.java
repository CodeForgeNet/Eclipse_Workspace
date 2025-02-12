package numberBasedProgram;

import java.util.Scanner;

public class Pascal_Triangle {
public static void getPascal(int n) {
	
	for(int x=0; x<n; x++) {
		int comb =1;
		for(int i=0; i<x; i++) {
			comb =comb*(n-i-1)/(i+1);
		}
		System.out.print(comb+" ");
	}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n : ");
		int n = sc.nextInt();
		
		getPascal(n);
		
		sc.close();
	}
}
