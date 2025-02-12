package classAssign;

import java.util.Random;
import java.util.Scanner;

public class nameGuess {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random r1 = new Random();
		int ran = r1.nextInt(11);

		int ip;
		do {
			System.out.println("You want to play game press '1' \n press '0' for exit.");
			ip = sc.nextInt();
			if (ip == 1) {
				int count = 0;
				for (int i = 0; i < 5; i++) {
					System.out.print("Guess a number between 0 to 10 : ");
					int n = sc.nextInt();
					if (ran == n) {
						System.out.println("Guessed right");
						count++;
//						break;
						ran = r1.nextInt(11);
						
					} else {
						System.out.println("Try again");

					}
				}
				if (count >= 3) {
					System.out.println("\nYou won\n");
				} else {
					System.out.println("\nYou loss\n");
				}
			}

		} while (ip != 0);
		sc.next();
	}
}
