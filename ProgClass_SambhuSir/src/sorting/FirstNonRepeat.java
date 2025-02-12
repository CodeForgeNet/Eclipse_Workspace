package sorting;

import java.util.Scanner;

public class FirstNonRepeat {

	public static void getElem(int[] a) {
//		for(int i=0; i<a.length; i++) {
//			int ct = 0;
//			for(int j=0; j<a.length; j++) {
//				if(a[i]==a[j]){
//					ct++;
//				}
//			}
//			if(ct==1) {
//				System.out.println("Element is : "+a[i] + "\nIndex is : "+i);
//				break;
//			}
//		}
		
		//2nd way
		for(int i=0; i<a.length; i++) {
			int ct = 1;
			for(int j=0; j<a.length; j++) {
				if(i!=j && a[i]==a[j]){
					ct++;
				}
			}
			if(ct==1) {
				System.out.println("Element is : "+a[i] + "\nIndex is : "+i);
				break;
			}
		}
		
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array : ");
		int n= sc.nextInt();
		int[] a= new int[n];
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		getElem(a);
		sc.close();
	}

}
