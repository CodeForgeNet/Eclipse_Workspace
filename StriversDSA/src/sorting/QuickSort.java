package sorting; 

import java.util.ArrayList; 
import java.util.Arrays; 
import java.util.List; 

//Time Complexity: O(nlogn)
//  1.Pick a pivot & place it in its correct place in the sorted array.
//  2.Smaller on the left and larger on the right.

public class QuickSort {
    
//	----3------
	
    static int partition(List<Integer> arr, int low, int high) { // Partition function to rearrange elements
        int pivot = arr.get(low); // Select the first element as pivot
        int i = low; // Initialize left pointer
        int j = high; // Initialize right pointer

        while (i < j) { // Loop until pointers cross
            while (arr.get(i) <= pivot && i <= high - 1) { // Move left pointer to the right for elements <= pivot
                i++; // Increment left pointer
            }

            while (arr.get(j) > pivot && j >= low + 1) { // Move right pointer to the left for elements > pivot
                j--; // Decrement right pointer
            }
            if (i < j) { // If pointers have not crossed
                int temp = arr.get(i); // Store value at left pointer
                arr.set(i, arr.get(j)); // Swap value at left pointer with right pointer
                arr.set(j, temp); // Complete the swap
            }
        }
        int temp = arr.get(low); // Store pivot value
        arr.set(low, arr.get(j)); // Place pivot at its correct position
        arr.set(j, temp); // Complete the swap
        return j; // Return the index of pivot
    }
    
    
    
    
    
    
//    ------2--------
    
    public static void qs(List<Integer> arr, int low, int high) { // Recursive quicksort function
        if (low < high) { // If there are at least two elements
            int pIndex = partition(arr, low, high); // Partition the array and get pivot index
            qs(arr, low, pIndex - 1); // Recursively sort left subarray
            qs(arr, pIndex + 1, high); // Recursively sort right subarray
        }
    }
    
    
    
    
    
// ----1------
    public static List<Integer> quickSort(List<Integer> arr) { // Wrapper function for quicksort
        qs(arr, 0, arr.size() - 1); // Call quicksort on the entire array
        return arr; // Return sorted array
    }
    
    
    
    

    public static void main(String[] args) { 
        List<Integer> arr = new ArrayList<>(); 
        arr = Arrays.asList(new Integer[] { 4, 6, 2, 5, 7, 9, 1, 3 }); // Initialize list with values
        int n = arr.size(); 
        System.out.println("Before Using insertion Sort: ");
        for (int i = 0; i < n; i++) { 
            System.out.print(arr.get(i) + " "); 
        }
        System.out.println(); 
        arr = quickSort(arr); 
        System.out.println("After insertion sort: "); 
        for (int i = 0; i < n; i++) { 
            System.out.print(arr.get(i) + " ");
        }
        System.out.println(); 

    }

}