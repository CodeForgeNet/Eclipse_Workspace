package com.Oops.Basics;

public class Customers {
	// Constructor overloading..
		String custName;
		long custContact;
		int custId;

		public Customers() {

		}
		public Customers(String custName) {
			this.custName = custName;
		}
		
		public Customers(String custName , int custId) {
			this.custName = custName;
			this.custId = custId;
		}
		
		public Customers(String custName , int custId ,long custContact) {
			this.custName = custName;
			this.custId = custId;
			this.custContact = custContact;
		}

		public void display() {
			System.out.println("[ " + custId + "," + custName + "," + custContact + " ]");
		}
		
		public static void main(String[] args) {
			Customers c1 = new Customers();
			c1.display();
			Customers c2 = new Customers("abc");
			c2.display();
			
			Customers c3 = new Customers("abc",102);
			c3.display();
			
			Customers c4 = new Customers("abc",102,899984774l);
			c4.display();
			
			
			
		
		}

	}
