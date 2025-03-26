package selfPattern;

/*	pattern-7
1  3  5  7  9
11 13 15 17 19
21 23 25 27 29
31 33 35 37 39
41 43 45 57 49
 */

public class OddDigIncrease {
	public static void main(String[] args) {
		int n=5,x=1;
		
		for(int i=1; i<=n; i++) {
			for(int j=1; j<=n; j++) {
				System.out.printf("%2d ",x);
				x+=2;
			}
			System.out.println();
		}
	}
}
