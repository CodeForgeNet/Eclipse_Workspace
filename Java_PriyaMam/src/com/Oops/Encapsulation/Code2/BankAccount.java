package com.Oops.Encapsulation.Code2;

public class BankAccount {
	
	private String customerString;
	private int customerAge;
	private long customerContact;
	private long customerBalance ;
	
	
	
	
//	Getters
	
	public String getCustName() {
		return customerString;
	}
	public int getCustAge() {
		return customerAge;
	}
	public long getCustContact() {
		return customerContact;
	}
	public long getCustBalance() {
		return customerBalance;
	}
	
	
	
//	Setters
	
	public void setCustBalance(long custBalance) {
		this.customerBalance=custBalance;
	}
	
	
//	Credit
	public void creditBalance(long amount) {
		this.customerBalance += amount;
	}
	
//	Debit
	public void debitBalance(long amount) {
		if (this.customerBalance>=amount) {
			this.customerBalance -= amount;
		}else {
			System.out.println("\nInsufficient Balance");
		}
	}
	

	
	public BankAccount (String custName, int custAge, long custContact, long custBalance) {
		this.customerString=custName;
		this.customerAge=custAge;
		this.customerContact=custContact;
		this.customerBalance= custBalance;
		
		
	}
	

}
