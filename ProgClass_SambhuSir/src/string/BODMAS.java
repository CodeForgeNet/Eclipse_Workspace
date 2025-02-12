package string;

import java.util.Scanner;

public class BODMAS {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char oper;
		double res = 0;
		double crntDig;

		System.out.print("Enter 1st digit : ");
		res = sc.nextDouble();

		do {
			System.out.print("Enter operator : ");
			oper = sc.next().charAt(0);

			if (oper!='=') {
				System.out.print("Enter next Digit : ");
				crntDig = sc.nextDouble();

				switch (oper) {
				case '/':
					if (crntDig != 0) {
						res /= crntDig;
					} else {
						System.out.println("Divided by zero is not applicable...");
					}
					break;
				case '*':
					res *= crntDig;
					break;
				case '+':
					res += crntDig;
					break;
				case '-':
					res -= crntDig;
					break;

				default:
					System.out.println("Invalid Operator");
					break;
				}
			}
		} while (oper !='=');
		System.out.println("Total is : " + res);
		sc.close();
	}

}
