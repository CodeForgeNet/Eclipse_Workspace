package sorting;

//import java.util.Scanner;

// Bubble sort :
//	Worst and Average Time Complexity : O(n^2)
//	Best Time complexity : O(n)


// In first iteration it goes from i-1 to 0, and in its first iteration it sort repeatedly swapping adjacent element.
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
			System.out.println("hi");
		}
		System.out.println("Sorted array: ");
	    for(int newArr : arr) {
	        System.out.print(newArr+ " ");
	    }
		
	}

	public static void main(String[] args) {
		
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Enter length of the Arrray : ");
//		int arrLen = sc.nextInt();
//		int[] arr = new int[arrLen];
//		for(int i=0; i<arrLen; i++) {
//			System.out.print("Enter "+(i+1)+" array elements : ");
//			int arrInp = sc.nextInt();
//			arr[i]=arrInp;
//		}
//		int[] arr = {6,5,4,3,2,1} ;
		int[] arr = {1,2,3,4,5,6} ;
		int arrLen= arr.length;
		bubbleSortArr(arr,arrLen);
		
		
//		sc.close();

	}

}
