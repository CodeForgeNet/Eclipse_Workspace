package com.Constructor;

//Constructor with Validation

public class Account {
	String accNum;
	int balance;
	
	public Account(String accNum, int balance) {
		if(accNum==null || accNum.isEmpty()) {
			System.err.print("Error: Account number cannot be empty or null");
			return;
		}
		if(balance<0) {
			System.err.print("Error: Balance cannot be negative");
			return;
		}
		this.accNum = accNum;
		this.balance = balance;
	}
	
	public static void main(String[] args) {
		Account ac1 = new Account("1234",5656);
		System.out.println(ac1.accNum+", "+ac1.balance);
		
		Account ac2 = new Account("",5656);
//		System.out.println(ac2.accNum+", "+ac2.balance);
	
		Account ac3 = new Account("9876",-56);
//		System.out.println(ac3.accNum+", "+ac3.balance);
		
	}
}
