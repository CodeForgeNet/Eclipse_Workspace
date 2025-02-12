package hashing;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class OccurrenceByMap {

//Occurrence of a number in an Array using Map.
	public static void countFreq(int[] arr, int n) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int i = 0; i < n; i++) {
			if (map.containsKey(arr[i])) {
				map.put(arr[i], map.get(arr[i]) + 1);
			} else {
				map.put(arr[i], 1);
			}
		}
		// Traverse through map and print
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " - " + entry.getValue());
		}
	}
	
	
//	Occurrence of a character in String using Map.
	public static void countCharFreq(String str, int sn) {
		Map<Character, Integer> map = new HashMap<Character, Integer>();
		for(int i=0 ; i<sn; i++) {
			if(map.containsKey(str.charAt(i))) {
				map.put(str.charAt(i), map.get(str.charAt(i))+1);
			}else {
				map.put(str.charAt(i), 1);
			}
		}
		//Traverse through map
		for(Map.Entry<Character, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey()+" - "+entry.getValue());
		}
	}
	
	

	public static void main(String[] args) {
		int[] arr = { 10, 5, 10, 15, 10, 5 };
		int n = arr.length;
		countFreq(arr, n);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String : ");
		String str = sc.next();
		int sn = str.length();
		countCharFreq(str,sn);
		
		sc.close();
	}
}
