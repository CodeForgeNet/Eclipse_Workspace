package com.Oops.Encapsulation.Code2;

import java.util.Scanner;

public class BankController {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		BankAccount account = new BankAccount("Obito_Uchiha" , 31, 9876543210l, 1000000l);
		
		System.out.println("\n\n-*-⚙️ \t️Your Details\t⚙️-*-");
		System.out.println("🧞 Your Name :- "+ account.getCustName());
		System.out.println("🧌 Your Age :- "+ account.getCustAge());
		System.out.println("📞 Your Contact :- "+ account.getCustContact());
		System.out.println("🤑 Your Balance 💵 :- "+ account.getCustBalance()+"$");
		
		System.out.print("\n\n Press 1️⃣ for Transaction & 0️⃣ for exit :-  ");
		int choice = sc.nextInt();
		
		
		
		
		if(choice==1) {
			
			System.out.println("\n☞ You have entered 💰 Transaction section 💳 ");
			System.out.print("☞ Press 2️⃣ for Credit Account 💸 & Press 3️⃣ for Debit Account 💳 :- ");
			int transact = sc.nextInt();
			
			
				
			if(transact==2) {
				System.out.print("☞ Enter amount to Credit:- $ ");
				long credAmt=sc.nextLong();
				account.creditBalance(credAmt);
				
				
			}else if (transact==3) {
				System.out.print("☞ Enter amount to Debit:- $ ");
				long debAmt=sc.nextLong();
				account.debitBalance(debAmt);
				
			}
			
			
			System.out.println("\n🧞 Your Name :- "+ account.getCustName());
			System.out.println("🧌 Your Age :- "+ account.getCustAge());
			System.out.println("📞 Your Contact :- "+ account.getCustContact());
			System.out.println("🤑 Your Balance 💵 :- "+ account.getCustBalance()+"$");
			
			
			
		}else {
			System.out.println("\n❌‍Exit🤦🏻");
		}
		
		
		
		
		
		sc.close();
	}

}
