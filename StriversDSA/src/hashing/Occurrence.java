package hashing;

//Occurrence of a number in an Array.
public class Occurrence {
	
	public static void countFreq(int[] arr, int n) {
		boolean[] visited = new boolean[n];
		
		for(int i=0; i<n; i++) {
			
			// Skip this element if already processed
			if(visited[i]==true) {
				continue;
			}
			
			//count frequency
			int count =1;
			for(int j=i+1; j<n; j++) {
				if(arr[i]==arr[j]) {
					visited[j]=true;
					count++;
				}
			}
			System.out.println(arr[i]+" -> "+count+" times");
			
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {10,5,10,15,10,5};
		int n = arr.length;
		countFreq(arr,n);
	}
}
