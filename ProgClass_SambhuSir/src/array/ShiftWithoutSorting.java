package array;

// i/p => [0,1,1,0,0,1,0,0]
// o/p => [0,0,0,0,0,1,1,1]

public class ShiftWithoutSorting {
	public static int[] getShift(int[] a) {
		int[] a2= new int[a.length];
		int count1=0;
		for(int i=0; i<a.length; i++) {
			if(a[i]==1) {
				count1++;
			}
		}
		
		for(int i=a2.length-1;count1>0; i--) {
			a2[i]=1;
			count1--;
		}
		return a2;
	}
	
	public static void main(String[] args) {
		int[] a= {1,0,0,1,0,0,1,1,1,0};
		int[] b = getShift(a);
		for(int p:b) {
			System.out.print(p+" ");
		}
	}
}
