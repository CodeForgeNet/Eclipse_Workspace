package array;

public class SmallestAndSecondSmallest {
	public static void getBig(int[] a) {
		int h1=0, h2=Integer.MAX_VALUE;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]<h1) {
				h2=h1;
				h1=a[i];
			}else if(a[i]<h2 && a[i]!=h1) {
				h2=a[i];
			}
		}
		System.out.println("smallest is :"+h1);
		if(h2==Integer.MIN_VALUE) {
			System.out.println("Second smallest doesn't exit");
		}else {
			System.out.println("Second smallest is :"+h2);			
		}
		
	}
	
	public static void main(String[] args) {
		int[] x = {90,90,12, 0, 34,45,45,0,2,2,2,23,3,3,3,3,76,76,90,90,2,3,4,5,2,2,23,3,4,3,4};
		getBig(x);
	}
}
