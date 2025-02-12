package classAssign.Array;
import java.util.Scanner;

public class PerfectNumber {
	
	    public static boolean isPerfect(int num) {
	        int sum = 0;
	        for (int i = 1; i <= num / 2; i++) {
	            if (num % i == 0) {
	                sum += i;
	            }
	        }
	        return sum == num;
	    }

	    public static void printPerfectNumbers(int[] arr) {
	        System.out.println("Perfect numbers in the array:");
	        for(int i=0; i<arr.length; i++) {
	        	int num = arr[i];
	            if (isPerfect(num)) {
	                System.out.println(num);
	            }
	        }
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter the length of the array: ");
	        int length = sc.nextInt();
	        int[] arr = new int[length];

	        for (int i = 0; i < length; i++) {
	            System.out.print("Enter element " + (i + 1) + ": ");
	            arr[i] = sc.nextInt();
	        }

	        printPerfectNumbers(arr);

	        sc.close();
	    }
	

}
