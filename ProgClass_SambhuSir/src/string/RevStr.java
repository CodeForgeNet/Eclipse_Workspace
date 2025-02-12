package string;
//WAJP to take a string input and resverse the string
public class RevStr {
	public static void main(String[] args) {
		String s1 = "asjdf8f3747hks";
		String rev = "";
		for(int i=s1.length()-1;i>=0;i--) {
//			rev = rev +s1.charAt(i);
			rev = s1.charAt(i)+rev; 
		}
	}
}
