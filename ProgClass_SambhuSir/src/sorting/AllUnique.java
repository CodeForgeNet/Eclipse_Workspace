package sorting;

import java.util.Scanner;
// if all unique then print true 
public class AllUnique {
	
	public static boolean getElem(int[] a) {
		for(int i=0; i<a.length; i++) {
			int ct = 1;
			for(int j=0; j<a.length; j++) {
				if(i!=j && a[i]==a[j]){
					ct++;
				}
			}
			if(ct==1) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array : ");
		int n= sc.nextInt();
		int[] a= new int[n];
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		System.out.println(getElem(a));
		
		sc.close();

	}

}
