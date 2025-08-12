package sorting;

//import java.util.Scanner;

// Bubble sort :
//	Worst and Average Time Complexity : O(n^2)
//	Best Time complexity : O(n)


// In first iteration it goes from i-1 to 0, and in its first iteration it sort repeatedly swapping adjacent element.
// It pushes the maxm to last.
public class BubbleSortArr {
	
	public static void bubbleSortArr(int[] arr, int n) {
		
		for(int i=n-1; i>=0; i--) {
			int didSwap=0;
			for(int j=0; j<=i-1; j++) {
				if(arr[j]>arr[j+1]) {
					int temp = arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
					didSwap=1;
				}
			}
			if(didSwap==0) {
				break;
			}
		}
		System.out.println("Sorted array: ");
	    for(int newArr : arr) {
	        System.out.print(newArr+ " ");
	    }
		
	}

	public static void main(String[] args) {
		int[] arr = {6,5,4,3,2,1} ;
		int arrLen= arr.length;
		bubbleSortArr(arr,arrLen);
		

	}

}
