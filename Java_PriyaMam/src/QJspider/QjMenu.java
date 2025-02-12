package QJspider;

import java.util.*;

public class QjMenu {

	public static void main(String[] args) {
		List<Qjdetails> lkd = new LinkedList<Qjdetails>();
		
		lkd.add(new Qjdetails("Karan",1,789456123));
		lkd.add(new Qjdetails("Shiwang",2,78934533));
		lkd.add(new Qjdetails("Tushar",3,723478923));
		
		
		Scanner sc = new Scanner(System.in);
		int inp ;
		
		do {
			System.out.println("Enter '1' to display student record.\nEnter '2' for add student record. \nEnter '3' for update any student record. \nEnter '4' to delete student record.\nEnter '5' to search a student record.\nEnter '0' for exit. ");
			inp = sc.nextInt();
			
			if(inp==1) {
				System.out.println();
				for(int i=0; i<lkd.size(); i++) {
					System.out.println(lkd.get(i));
				}
				
			}else if(inp==2) {
				
				System.out.print("Enter student name:");
				String stName = sc.nextLine();
				System.out.print("Enter student id:");
				int stId = sc.nextInt();
				System.out.print("Enter student mob_no:");
				long stMob = sc.nextLong();
				
				lkd.add(new Qjdetails(stName,stId,stMob));
				
				System.out.println("\n----Update Student Record----");
				for(int i=0; i<lkd.size(); i++) {
					System.out.println(lkd.get(i));
				}
				
			}else if(inp==3) {
				
				char ch;
				do {
					System.out.println("Enter 'n/N' for update NAME.\nEnter 'e/E' for exits.");
					ch= sc.next().charAt(0);
					
					
					if(ch=='n'|| ch=='N') {
						System.out.println("Enter student id whose you want to chase:");
						int sId=sc.nextInt();
						System.out.println("Enter new name:");
						String newName= sc.nextLine();
						
						Map<Integer,Object> mp = new LinkedHashMap<Integer,Object>();
						
						for(int i=0;i<lkd.size();i++) {
							
							mp.put(lkd.get(i).getId(), lkd.get(inp));
							
							String oldName=lkd.get(i).getName();
							if(lkd.get(i).getId()==sId) {
								oldName=newName;
								
							}
						}
			
					}
					System.out.println("\n----Update Student Record----");
					for(int i=0; i<lkd.size(); i++) {
						System.out.println(lkd.get(i));
					}
					
				}while(ch!='e'|| ch!='E');
				
			}
			
		}while(inp!=0);

	}

}
