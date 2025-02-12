package numberBasedProgram;

import java.util.Random;
import java.util.Scanner;

public class RanNum_ByUsing_Random {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter first bound : ");
		int a = sc.nextInt();
		System.out.println("Enter second bound : ");
		int b = sc.nextInt();

		Random r1 = new Random();
		
		for(int i=0; i<10; i++) {
			int ranNum = a+r1.nextInt(b-a);
			System.out.println("Random number "+i+" is "+ranNum);
		}
		
		
		sc.close();
	}

}
