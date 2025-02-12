package classAssign.Array;

import java.util.Scanner;

public class StudentssCtrl {
	static Studentss[] studentss = new Studentss[20];	
	static int index=0;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Studentss s = new Studentss();
		
		int inp;
		
		
		do {
			System.out.println("Enter 1 for insert data\nEnter 2 for display data\nEnter 3 for delete data\nEnter 4 for update data\nEnter 0 for exit.\n");
			inp=sc.nextInt();
			
			if(inp==1) {
				
				if(index<studentss.length) {
					
					System.out.print("Enter student Name : ");
					s.setName(sc.next());
					
					System.out.print("Enter student rollno : ");
					s.setRollno(sc.nextInt());
					
					System.out.print("Enter student age : ");
					s.setAge(sc.nextByte());
					
					System.out.print("Enter student mobno : ");
					s.setMob(sc.nextLong());
					
					
					studentss[index] =s;
					index++;
					
				}
					
					
					
				
				
			}else if(inp==2) {
				
				for(int i=0; i<studentss.length; i++) {
					System.out.println("Name: "+studentss[i].getName()+" Rollno: "+studentss[i].getRollno()+" Age: "+studentss[i].getAge()+" Mobno: "+studentss[i].getMob());
				}
				
			}else if(inp==3) {
				
			}else if(inp==4) {
				
			}else {
				System.out.println("exit");
			}
			
			
		}while(inp!=0);
		
	}

}
