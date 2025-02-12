package numberBasedProgram;

import java.util.*;

// using Math class.

public class RandomNum_byUsingMath {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first bound : ");
		int a = sc.nextInt();
		System.out.println("Enter second bound : ");
		int b = sc.nextInt();
		
		int randomnum = a+(int)(Math.random()*(b-a));
		System.out.println(randomnum);
		
		
		sc.close();
	}

}
