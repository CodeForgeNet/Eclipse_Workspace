package array;

import java.util.Scanner;

public class RemoveIndex {

	public static int[] rmvElem(int[] k, int index) {
		int[] p = new int[k.length - 1];
		for(int i=0; i<k.length; i++) {
			if(i<index) {
				p[i]=k[i];
			}
			if(i>index) {
				p[i-1]=k[i];
			}
		}
		return p;

	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] a = { 12, 20, 30, 40, 16 };
		System.out.print("Enter index: ");
		int index = sc.nextInt();

		a = rmvElem(a, index);
		for (int p : a) {
			System.out.println(p);
		}
		sc.close();
	}

}
