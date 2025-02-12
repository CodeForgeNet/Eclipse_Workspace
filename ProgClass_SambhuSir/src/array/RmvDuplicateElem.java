//package array;
//
//public class RmvDuplicateElem {
//	public static int[] getUniq(int[] a) {
//		int n=a.length;
//		
//		for(int i=0; i<n; i++) {
//			int ct = 1;
//			
//			for(int j=i+1; j<n; j++) {
//				if(a[i]==a[j]) {
//					ct++;
//					a[j]= a[n-1];
//					n--;
//					j--;
//				}
//			}
//			int [] b = new int[n];
//			for(int l=0; l<n; l++) {
//				b[i]=a[i];
//			}
//		}
//		return b;
//		
//	}
//	
//	public static void main(String[] args) {
//		int[] x = {12, 0, 34,45,45,0,2,2,2,23,3,3,3,3,76,76,90,2,3,4,5,2,2,23,3,4,3,4};
//		int[] p = new getUniq(x);
//		
//		for(int z:p) {
//			System.out.println(z);
//		}
//	}
//}
