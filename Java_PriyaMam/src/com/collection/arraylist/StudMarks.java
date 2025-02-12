package com.collection.arraylist;

import java.util.ArrayList;
import java.util.Scanner;

public class StudMarks {

	public static void main(String[] args) {
		
		ArrayList mk= new ArrayList();
		
		ArrayList percentArr= new ArrayList();	
		double sumPercent = 0;
		
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number of student : ");
		int n = sc.nextInt();
		
		
		for(int i=0; i<n; i++) {
			System.out.print("Enter '"+ (i+1) +"' Student total number of subject : ");
			int ns = sc.nextInt();
			double sum = 0;
			
			for(int j=0; j<ns; j++) {
				System.out.print("enter "+(j+1)+" subject marks : ");
				double m = sc.nextDouble();
				mk.add(m);
				sum+=m;
			}
			
			double percent = (sum/(ns*100)*100);
			percentArr.add(percent);
			sumPercent += percent;
			
		}
		

		
		byte sign;
		do {
			System.out.println("\n Enter '1' for Highest percentage.\n Enter '2' for Lowest percentage. \n Enter '3' for average percentage. \n Enter '4' for Index of Maximum percent. \n Enter '5' for Index of lowest percent.\n Enter '6' for view percentage seperated by comma.\n Enter'0' for EXIT. \n");
			sign= sc.nextByte();
			
			if(sign==1) {
//				1.Highest percent
				double maxP = (double)percentArr.get(0);
				for(int i=1; i<percentArr.size(); i++){
					if(maxP < (double)percentArr.get(i)) {
						maxP=(double)percentArr.get(i);
					}
				}
				System.out.println("\nMaximum percent from all student : "+maxP+ "%");
				
				
			}else if(sign==2) {
//				2.Minimum percent
				double minP = (double)percentArr.get(0);
				for(int i=1; i<percentArr.size(); i++) {
					if(minP > (double)percentArr.get(i)) {
						minP = (double)percentArr.get(i);
					}
				}
				System.out.println("\nMinimum percent from all student : "+minP+ "%");
				
				
			}else if(sign==3) {
//				3.Average percent
				double avgP = sumPercent/percentArr.size();
				System.out.println("\nAverage percent is : "+avgP);
				
				
			}else if(sign==4) {
//				4. Index of max percent
				double maxP = (double)percentArr.get(0);
				int maxIndex = 0;
				for(int i=1; i<percentArr.size(); i++){
					if(maxP < (double)percentArr.get(i)) {
						maxP=(double)percentArr.get(i);
						maxIndex = i;
					}
				}
				System.out.println("\nIndex of max percent is : "+maxIndex);
				
				
			}else if(sign==5) {
//				5. Index of min percent
				double minP = (double)percentArr.get(0);
				int minIndex = 0;
				for(int i=1; i<percentArr.size(); i++) {
					if(minP > (double)percentArr.get(i)) {
						minP = (double)percentArr.get(i);
						minIndex = i;
					}
				}
				System.out.println("Index of Min percent is : "+minIndex);
				
				
			}else if(sign==6) {
//				6. Percent seperated by comma using for loop
				for(int i=0; i<percentArr.size(); i++) {
					System.out.print(percentArr.get(i));
					if(i!=percentArr.size()-1) {
						System.out.print(", ");
					}
				}
				
				
			}else {
				System.out.println(" EXIT ");
			}
			
			
			
		}while(sign!=0);
		

		
		sc.close();
	}

}
