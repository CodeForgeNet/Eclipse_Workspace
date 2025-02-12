package com.collection.linkedlist.triedProd;

import java.util.Scanner;

public class Products {
	public static void main(String[] args) {
		
//		Brand 1 : 
		Brand brand1 = new Brand("Brand1");
		brand1.addTshirts(new Tshirts(" Oversized ","A12",7600));
		brand1.addTshirts(new Tshirts(" SlimFit ","A14",6400));
		
//		Brand 2 : 
		Brand brand2 = new Brand("Brand2");
		brand2.addTshirts(new Tshirts(" Printed ","B23",8000));
		brand2.addTshirts(new Tshirts(" Checked ","B26",7500));
		
		
		Scanner sc = new Scanner(System.in);
		
		int sign;
		
		do {
			System.out.println("Enter 1 for price , 2 for product name , 3 for id : ");
			sign = sc.nextInt();
			if(sign==1) {
				brand1.printTshirtsPrice();
				brand2.printTshirtsPrice();
				
			}else if(sign==2) {
				brand1.printTshirtsType();
				brand2.printTshirtsType();
				
			}else if(sign==3) {
				brand1.printTshirtsId();
				brand2.printTshirtsId();
			}
			
			
		}while(sign!=0);
		
	}
	
}
