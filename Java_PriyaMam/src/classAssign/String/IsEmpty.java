package classAssign.String;

public class IsEmpty {
	
	public static boolean isEmpty(String str) {
		if(str.length()==0) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args) {
		
		String str1 = "";
		String str2 = "Karan";
		
		System.out.println("str1 is empty? : "+isEmpty(str1));
		System.out.println("str2 is empty? : "+isEmpty(str2));
	}

}
