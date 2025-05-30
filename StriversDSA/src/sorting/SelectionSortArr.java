package sorting;

import java.util.Scanner;


// swap happen at index 0 and min no. index ( 0 to n-1)
// swap happen at index 1 and min no. index ( 1 to n-1) and so on.
// it select 0 index then find minm in all then swap to 0 index, and the 0 index no goes to swaped index. Then do same but from 1st index coz 0 index is swaped already.


// Best, Worst, Average Time complexity is = O(n^2)

public class SelectionSortArr {
	
//	public static void sortArr(int[] arr, int arrLen) {
//		for(int i=0; i<arrLen-1; i++) {
//			for(int j=i+1; j<arrLen; j++) {
//				if(arr[j]<arr[i]) {
//					int temp = arr[i];
//					arr[i]=arr[j];
//					arr[j]=temp;
//				}
//			}
//		}
//		for(int elem : arr) {
//			System.out.print(elem+" "); 
//		}
//	}
	
	public static void sortArr(int[] arr, int n) {
		for(int i=0; i<i-1; i++) {
			int mini=i;
			for(int j=i+1; j<n; j++) {
				if(arr[j]<arr[mini]) {
					mini=j;
				}
			}
			int temp = arr[mini];
			arr[mini]=arr[i];
			arr[i]=temp;
		}
		
		System.out.println("After selection sort: ");
		for(int elem : arr) {
			System.out.print(elem+" "); 
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of the Arrray : ");
		int arrLen = sc.nextInt();
		int[] arr = new int[arrLen];
		for(int i=0; i<arrLen; i++) {
			System.out.print("Enter "+(i+1)+" array elements : ");
			int arrInp = sc.nextInt();
			arr[i]=arrInp;
		}
		sortArr(arr,arrLen);
		
		sc.close();
	}
}
