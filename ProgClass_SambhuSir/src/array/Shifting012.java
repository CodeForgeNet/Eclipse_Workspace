package array;

public class Shifting012 {
	
// 2nd way.
//	public static int[] getShift(int[] a) {
//	    int[] a2 = new int[a.length];
//	    
//	    int count0 = 0;
//	    int count1 = 0;
//	    int count2 = 0;
//
//	    for (int i = 0; i < a.length; i++) {
//	        if (a[i] == 0) {
//	            count0++;
//	        } else if (a[i] == 1) {
//	            count1++;
//	        } else if (a[i] == 2) {
//	            count2++;
//	        }
//	    }
//
//	   
//	    for (int i = 0; i < a.length; i++) {
//	        if (count0 > 0) {
//	            a2[i] = 0;
//	            count0--;
//	        } else if (count1 > 0) {
//	            a2[i] = 1;
//	            count1--;
//	        } else if (count2 > 0) {
//	            a2[i] = 2;
//	            count2--;
//	        }
//	    }
//
//	    return a2;
//	}
	
	
	
	// 1st way
	public static int[] getShift (int[] a) {
		int count0=0;
		int count1=0;
		
		for(int i=0; i<a.length; i++) {
			if(a[i]==0) {
				count0++;
			}else if(a[i]==1) {
				count1++;
			}
		}
		
		int[] b= new int[a.length];
		
		for(int i=count0; i<b.length; i++) {
			if(i<count0+count1) {
				b[i]=1;
			}else {
				b[i]=2;
			}
		}
		return b;
	}

	
	public static void main(String[] args) {
		int[] a= {1,0,0,2,2,1,2,0,0,1,1,2,1,0,2};
		int[] b = getShift(a);
		for(int p:b) {
			System.out.print(p+" ");
		}
	}

}
