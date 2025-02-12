package classAssign.Array;

import java.util.Scanner;

public class StudentTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=0;
	
			System.out.println("Enter no of Students : ");
			n = sc.nextInt();
		
		Student[] student = new Student[n];
		
		for(int i=0; i<n;i++) {
			System.out.print("Enter "+(i+1)+ " student Name : ");
			String name = sc.next(); 
			
			System.out.print("Enter "+(i+1)+ " student rollno : ");
			int rollno = sc.nextInt();
			
			System.out.print("Enter "+(i+1)+ " student age : ");
			byte age = sc.nextByte();
			
			System.out.print("Enter "+(i+1)+ " student Grade : ");
			String grade = sc.next();
			
			System.out.print("Enter "+(i+1)+ " student Total Marks : ");
			float totalMarks = sc.nextFloat();
			
			student[i] = new Student(name, rollno, age, grade,totalMarks); 
			
		}
		
		
		
		int sign;
		
		do {
			System.out.println("\n\nEnter '1' for details whose rollno is odd \n Enter '2' for details whose name contain atleast three vowels in name \n Enter '3' for details whose grades is 'A+' \n Enter '4' for details whose name start with his grade \n Enter '5' for maximum marks of student  \n Enter '0' for Exit  ");
			
			sign = sc.nextInt();
			
			if(sign==1) {
				for(int i=0; i<n; i++) {
					if(student[i].rollno % 2 != 0) {
						System.out.println(student[i]);
					}
				}
				
				
				
			}else if (sign==2) {
				for(int i=0; i<n; i++) {
					student[i].name = student[i].name.toLowerCase();
					int vCount =0;
					for(int j=0; j<student[i].name.length(); j++) {
						if(student[i].name.charAt(j)=='a' || student[i].name.charAt(j)=='e' || student[i].name.charAt(j)=='i' || student[i].name.charAt(j)=='o' || student[i].name.charAt(j)=='u' ) {
							
							vCount++;
							if(vCount==3) {
								System.out.println(student[i]);	
								
							}
						}
					}
				}
				
				
				
			}else if (sign==3) {
				for(int i=0; i<n; i++) {
					student[i].grade.toUpperCase();
				if(student[i].grade.equals("A+") ) {
					System.out.println(student[i]);
					}
				}
				
				
				
			}else if (sign==4) {
				for(int i=0; i<n; i++) {
					student[i].grade.toUpperCase();
					student[i].name.toUpperCase();
					if(student[i].grade.charAt(0) == student[i].name.charAt(0)) {
						System.out.println(student[i]);
					}
				}
				
				
				
			}else if (sign==5) {
				float maxM= student[0].totalMarks;
				Student stud = student[0];
				for(int i=1; i<n; i++) {
					if(maxM < student[i].totalMarks) {
						maxM=student[i].totalMarks;
						stud=student[i];
					}
				}
				System.out.println(stud);
				
				
				
			} else if(sign==6) {  // Search student name (for compare take input from user)
				for(int i=0; i<n; i++) {
				if(student[i].name.equals(student[i].name) ) {
					System.out.println(student[i]);
					}
				}
			}else if(sign ==7) { // first & last not vowels.
				for(int i=0; i<n; i++) {
					student[i].name.toLowerCase();
					int len = student[i].name.length();
					if(student[i].name.charAt(0)!= 'a' && student[i].name.charAt(len-1) != 'a' ||  student[i].name.charAt(0)!= 'e' && student[i].name.charAt(len-1) != 'e' || student[i].name.charAt(0)!= 'i' && student[i].name.charAt(len-1) != 'i' || student[i].name.charAt(0)!= 'o' && student[i].name.charAt(len-1) != 'o' || student[i].name.charAt(0)!= 'u' && student[i].name.charAt(len-1) != 'u' )  {
						System.out.println(student[i]);
					}
				}
			} else if(sign==8) { // if 'a' then reverse name.
				
				for(int i=0; i<n; i++) {
					student[i].name.toLowerCase();
					int len = student[i].name.length();
					if(student[i].name.charAt(i)=='a') {
						for(int j=len; j>=0; j--) {
							System.out.print(student[i].name.charAt(len));
						}
					}
					
				}
				
			}
			else {
				System.out.println("---- Exit ----");
			}
			
			
		} while (sign!=0);
		sc.close();
	}

}

