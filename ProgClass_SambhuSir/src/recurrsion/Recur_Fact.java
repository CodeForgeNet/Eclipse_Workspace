package recurrsion;

public class Recur_Fact {
	public static void main(String[] args) {
		int res;
		res=factorial(5);
		System.out.println(res);
	}
	public static int factorial(int n) {
		if (n==0) {
			return 1;
		}
		else if (n==1) {
			return 1;
			
		}
		else {
			return n * factorial(n-1);
		}

	}

}
