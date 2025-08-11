package recursion;

import java.util.Scanner;

public class ReverseArray {

//	** Using single pointer

	static void f(int i, int[] arr, int n) {
		if (i >= n / 2)
			return;

		// Swap arr[i] with arr[n-i-1]
		int temp = arr[i];
		arr[i] = arr[n - i - 1];
		arr[n - i - 1] = temp;

		f(i + 1, arr, n);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("Total no. of array elem : ");
		int n = scanner.nextInt();
		int[] arr = new int[n];

		// Read array elements
		for (int i = 0; i < n; i++) {
			arr[i] = scanner.nextInt();
		}

		// Call recursive function to reverse array
		f(0, arr, n);

		// Print the reversed array
		for (int i = 0; i < n; i++) {
			System.out.print(arr[i] + " ");
		}

		scanner.close();
	}
	
	
	
	

//	Using two pointers
//	public static void reverse(int[] a, int l, int r) {
//		if (l >= r)
//			return;
//		// Swap a[l] and a[r]
//		int temp = a[l];
//		a[l] = a[r];
//		a[r] = temp;
//		// Recursive call
//		reverse(a, l + 1, r - 1);
//	}
//
//	public static void main(String[] args) {
//
//		int[] a = { 1, 2, 3, 4, 5 };
//		System.out.println("Original array:");
//		for (int num : a)
//			System.out.print(num + " ");
//		System.out.println();
//
//		reverse(a, 0, a.length - 1);
//
//		System.out.println("Reversed array:");
//		for (int num : a)
//			System.out.print(num + " ");
//		System.out.println();
//
//	}

}
