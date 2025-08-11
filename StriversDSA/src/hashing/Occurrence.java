package hashing; 


public class Occurrence {

	public static void countFreq(int[] arr, int n) { 
		boolean[] visited = new boolean[n]; // Array to mark visited elements

		for (int i = 0; i < n; i++) { // Loop through each element

			// Skip this element if already processed
			if (visited[i] == true) { // Check if element is already visited
				continue; // Skip to next iteration
			}

			// count frequency
			int count = 1; // Initialize count for current element
			for (int j = i + 1; j < n; j++) { // Loop through remaining elements
				if (arr[i] == arr[j]) { // If duplicate found
					visited[j] = true; // Mark duplicate as visited
					count++; // Increment count
				}
			}
			System.out.println(arr[i] + " -> " + count + " times"); 

		}
	}

	public static void main(String[] args) { 
		int[] arr = { 10, 5, 10, 15, 10, 5 }; 
		int n = arr.length; 
		countFreq(arr, n); 
	}
}