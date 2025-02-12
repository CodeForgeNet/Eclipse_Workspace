package classAssign.Array;

public class BasicQue {
	
//	01. wajp to find out smallest element in given array
//	02. wajp to find out second smallest element in given array
//	03. wajp to find out largest element in given array
//	04. wajp to find out second largest element in given array
	
	
//		01 & 02
//		public static void getBig(int[] a) {
//			int h1=0, h2=Integer.MAX_VALUE;
//			
//			for(int i=0; i<a.length; i++) {
//				if(a[i]<h1) {
//					h2=h1;
//					h1=a[i];
//				}else if(a[i]<h2 && a[i]!=h1) {
//					h2=a[i];
//				}
//			}
//			System.out.println("smallest is :"+h1);
//			if(h2==Integer.MIN_VALUE) {
//				System.out.println("Second smallest doesn't exit");
//			}else {
//				System.out.println("Second smallest is :"+h2);			
//			}
//			
//		}
		

//		03 & 04
//		public static void getBig(int[] a) {
//			int h1=0, h2=Integer.MIN_VALUE;
//			
//			for(int i=0; i<a.length; i++) {
//				if(a[i]>h1) {
//					h2=h1;
//					h1=a[i];
//				}else if(a[i]>h2 && a[i]!=h1) {
//					h2=a[i];
//				}
//			}
//			System.out.println("Biggest is :"+h1);
//			if(h2==Integer.MIN_VALUE) {
//				System.out.println("Second biggest doesn't exit");
//			}else {
//				System.out.println("Second Biggest is :"+h2);			
//			}
//			
//		}
		
//		public static void main(String[] args) {
//			int[] x = {90,90,12, 0, 34,45,45,0,2,2,2,23,3,3,3,3,76,76,90,90,2,3,4,5,2,2,23,3,4,3,4};
//			getBig(x);
//		}
	
	
//	05. WAJP to check whether the given character is present in given char array or not
//	06. WAJP to print first occurrence of an element in a given array of char type
//	07. WAJP to print last occurrences of an element in a given array of char type
//	08. WAJP to find out the frequency of a given element in an int type of array
		
	
//	05.
	public static void charCheck(char[] cha, char c) {
		for(int i=0; i<cha.length; i++) {
			if(c==cha[i]) {
				System.out.println(c+"is present");
			}else {
				System.out.println(c+"is present");
			}
		}
	}
	
//	06.
	public static void occChar(char[] ch) {
		char fCh = ch[0];
		int ct = 0;
		for(int i=1; i<ch.length; i++) {
			if(fCh==ch[i]) {
				ct++;
			}
		}
		System.out.println(fCh+" occurence is "+ct);
	}
	
//	07.
	public static void occCharLst(char[] ch) {
		char fCh = ch[ch.length-1];
		int ct = 0;
		for(int i=0; i<ch.length-1; i++) {
			if(fCh==ch[i]) {
				ct++;
			}
		}
		System.out.println(fCh+" occurence is "+ct);
	}
	
//	08.
	
	

}
