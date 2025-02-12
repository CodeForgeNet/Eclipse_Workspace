package string;

public class WithoutLentMet {
	// Print the length of the string without using length method.
	public static void main(String[] args) {
		String s1 = "Karan and Prerna";
		String s2 = "BF";
//		1st way : there is a null character in before string and after also i.e;
		s1 = s1 + '\0';
		s2 = s2 + '\0';
		System.out.println(s1.indexOf('\0'));
		System.out.println(s2.indexOf('\0'));
		System.out.println(s1.indexOf('\0') - s2.indexOf('\0'));

//		2nd way: using loop
		int i = 0;
		int ct = 0;
		while (true) {
			if (s1.charAt(i) == '\0') {
				break;
			}
			ct++;
			i++;
		}
		System.out.println(ct);
		
		
//		3rd way : using char array;
		char [] p = s1.toCharArray();
		System.out.println(p.length);
		
		
//		4th way : for each loop
		int cnt = 0;
		for(char x : p) {
			cnt++;
		}
		System.out.println(cnt);
		
		
//		5th way : using intern method (it moves control form heap area to SCP area).
		String s3 = "mohan";
		String s4 = new String ("mohan");
		s4=s4.intern();
		System.out.println(s3==s4);
		

	}
}



