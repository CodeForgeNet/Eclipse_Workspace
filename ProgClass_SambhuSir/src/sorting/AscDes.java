package sorting;

import java.util.Scanner;

public class AscDes {

    public static int[] getSort(int[] a) {
        int n = a.length;
        for (int i = 0; i < n - 1; i++) {
            int x = 0;
            for (int j = 0; j < n - 1 - i; j++) {
                if (a[j] > a[j + 1]) {
                    a[j] = a[j] + a[j + 1];
                    a[j + 1] = a[j] - a[j + 1];
                    a[j] = a[j] - a[j + 1];
                    x = 1;
                }
            }
            if (x == 0) {
                break;
            }
        }
        return a;
    }

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
		System.out.print("Enter length of array : ");
		int n= sc.nextInt();
		int[] a= new int[n];
		for(int i=0; i<a.length; i++) {
			a[i]=sc.nextInt();
		}
		
		getSort(a);
		int l = a.length / 2;
        int p = 0;
        for (int i = 0; i < a.length; i++) {
            if (i < l) {
                System.out.print(a[i] + " ");
            } else {
                System.out.print(a[a.length - 1 - p] + " ");
                p++;
            }
        }
		
		sc.close();

    }
}
