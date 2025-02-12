package classAssign.String;

import java.util.Scanner;

public class Student {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] name = new String[6];
		for(int index = 0; index<name.length;index++) {
			System.out.print("Enter element at "+index+"index : ");
			name[index] = sc.next();
		}
		
		
		int sign;
		do {
			sign = sc.nextInt();
			if(sign==1) { // search name
				System.out.println("Enter a name : ");
				String naam = sc.next();
				for(int i=0; i<6; i++) {
					if(name[i].equals(naam)) {
						System.out.println(name[i]);
					}
				}
				
			}else if(sign==2) { // 3 vowels
				int vCount =0;
				for(int i=0; i<6; i++) {
					name[i].toLowerCase();
					if(name[i].charAt(i)=='a'  || name[i].charAt(i)=='e'  || name[i].charAt(i)=='i' || name[i].charAt(i)=='o' || name[i].charAt(i)=='u'  ){
						vCount++;
					}
					if(vCount==3) {
						System.out.println(name[i]);
						
					}
				}
				
			}else if(sign==3) { // first & last no vowels
				for(int i=0; i<6; i++) {
					name[i].toLowerCase();
					int len = name[i].length();
					if(name[i].charAt(0) != 'a' && name[i].charAt(len-1)!='a' || name[i].charAt(0) != 'e' && name[i].charAt(len-1)!='e' || name[i].charAt(0) != 'i' && name[i].charAt(len-1)!='i' || name[i].charAt(0) != 'o' && name[i].charAt(len-1)!='o' || name[i].charAt(0) != 'u' && name[i].charAt(len-1)!='u'    ) {
						System.out.println(name[i]);
					}
				}
			}else if(sign==4) { // reverse name
				String naam = "";
				int vowels =0;
				for(int i=0; i<6; i++) {
					name[i].toLowerCase();
					int len= name[i].length();
		
					if(name[i].charAt(i)=='a') {
//						codes written to left here.
						for(int k=len-1; k>=0; k--) {
							char ch= name[i].charAt(k);
							naam +=ch;
						
						}
					}
					naam+=" ";
					
					
					System.out.println(" ");
					System.out.println(naam);
				}
			}
			
		}while(sign!=0);
		
		
		
	
		sc.close();
	}
	
}
