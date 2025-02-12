package com.Oops.CustomException;

public class BankAccControl {

	public static void main(String[] args) {
		BankAccount acc = new BankAccount(1000);
		
		try {
			acc.withdraw(2000);
		}catch(InsufficientBalanceException e) {
			System.out.println(e.getMessage());
		}

	}

}
