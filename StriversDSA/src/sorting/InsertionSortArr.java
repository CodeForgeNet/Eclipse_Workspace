package sorting;

//	Take an element and places it in correct order. Like it take i=0 then 0-1 then 0-2 then 0-3 and so on. simultaneously swap it to its best position.

// Average & Worst TC => O(n^2)
// Best TC => O(n)

public class InsertionSortArr {
	
	public static void insertion_sort(int[] arr, int n) {
		for(int i=0; i<n; i++) {
			int j=i;
			while(j>0 && arr[j-1]>arr[j]) {
				int temp = arr[j-1];
				arr[j-1] = arr[j];
				arr[j] = temp;
				j--;
			}
		}
		System.out.println("After Insertion sort");
		for(int sort : arr) {
			System.out.print(sort+" ");
		}
	}

	public static void main(String[] args) {
		int arr[] = {13, 46, 24, 52, 20, 9};
        int n = arr.length;
        System.out.println("Before Using insertion Sort: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        insertion_sort(arr, n);
	}

}
