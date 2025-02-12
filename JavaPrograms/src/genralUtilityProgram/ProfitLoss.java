package genralUtilityProgram;

import java.util.Scanner;

public class ProfitLoss {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter cost price");
		float cp= sc.nextFloat();
		
		System.out.print("Enter selling price");
		float sp= sc.nextFloat();
		
		float profit = sp-cp;
		float loss = cp-sp;
		
		if(profit>cp) {
			
			float prPer = (profit/cp)*100;
			System.out.println(prPer);
			
		}else if(cp>loss) {
			
			float lossPer = (loss/cp)*100;
			System.out.println(lossPer);
			
		}else {
			System.out.println("No profit no loss");
		}
		
	}

}
