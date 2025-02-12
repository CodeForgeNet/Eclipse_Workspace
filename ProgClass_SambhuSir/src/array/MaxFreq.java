package array;

public class MaxFreq {
	public static void getFreq(int[] a) {
		int n=a.length;
		int maxFrq=0;
		int val=0;
		for(int i=0; i<n; i++) {
			int ct = 1;
			for(int j=i+1; j<n; j++) {
				if(a[i]==a[j]) {
					ct++;
					a[j]= a[n-1];
					n--;
					j--;
				}
			}
			if(maxFrq<ct) {
				maxFrq=ct;
				val = a[i];
			}
		}
		System.out.println("The element "+val+" is highest times = "+maxFrq);
	}
	
	public static void main(String[] args) {
		int[] a = {12, 0, 34,45,45,0,2,2,2,23,3,3,3,3,76,76,90,2,3,4,5,2,2,23,3,4,3,4};
		getFreq(a);
	}
}
