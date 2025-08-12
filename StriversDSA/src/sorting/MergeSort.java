package sorting;

import java.util.ArrayList;

// Divide and Merge

public class MergeSort {
	
	public static void mergeSort(int[] arr, int low, int high) {
		if(low >= high) return ;
		int mid = (low+high)/2;
		mergeSort(arr,low,mid);
		mergeSort(arr,mid+1,high);
		merge(arr, low, mid, high);
	}
	
	
	
	public static void merge(int[] arr, int low, int mid, int high) {
		ArrayList<Integer> temp = new ArrayList<>();
		int left=low; //starting index of left half of arr
		int right= mid+1;	//starting index of right half of arr
		
		// Storing elements in temporary array in a sorted manner.
		while(left<=mid && right<=high) {
			if(arr[left]<=arr[right]) {
				temp.add(arr[left]);
				left++;
			}else {
				temp.add(arr[right]);
				right++;
			}
		}
		// If elements of left half are still left
		while(left<=mid) {
			temp.add(arr[left]);
			left++;
		}
		// If elements of right half are still left
		while(right<=high) {
			temp.add(arr[right]);
			right++;
		}
		// Transferring all elements from temporary to array
		for(int i=low; i<=high; i++) {
			arr[i]=temp.get(i-low);
		}
	}

	
	
	
	public static void main(String[] args) {
		int arr[] = { 9, 4, 7, 6, 3, 1, 5, 1 };
		int n= arr.length;
		System.out.println("Before sorting array: ");
        for (int arrElem : arr) {
            System.out.print(arrElem + " ");
        }
        
        mergeSort(arr,0,n-1);
        System.out.println("After sorting array: ");
        for (int arrElem : arr) {
            System.out.print(arrElem + " ");
        }
	}

}
