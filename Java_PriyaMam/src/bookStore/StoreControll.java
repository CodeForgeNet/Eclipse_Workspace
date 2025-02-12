package bookStore;

import java.util.*;

public class StoreControll {

	public static void main(String[] args) {
		List<BookStore> bli = new ArrayList<BookStore>();
		
		bli.add(new BookStore("Gravity of BlackHole", "Karan","SciFi",500,21));
		bli.add(new BookStore("Mindset", "Arjun","Psychology",800,223));
		bli.add(new BookStore("Power of Words", "Shiwang","Social",850,32));
		bli.add(new BookStore("Emotions of Eye", "Karan","Psychology",300,45));
		bli.add(new BookStore("Pain", "Nagato","Social",1200,69));
		
		
		
		Scanner sc = new Scanner(System.in);
		int sign;
		
		do {
			System.out.println("Enter 1 for Books details.\nEnter 2 for add Books.\nEnter 3 for remove Books.\nEnter 4 for search books by his Id.\nEnter 0 for exits. ");
			sign = sc.nextInt();
			
			if(sign==1) {
				for(int i=0; i<bli.size(); i++) {
					System.out.println(bli.get(i));
				}
			}else if(sign==2) {
				
				System.out.println("Enter your book title");
				String btitle = sc.next();
				System.out.println("Enter your book author");
				String bAuth= sc.next();
				System.out.println("Enter your book genre");
				String bgen = sc.next();
				System.out.println("Enter your book price");
				double bPrice = sc.nextDouble();
				System.out.println("Enter your book id");
				int bId = sc.nextInt();
				
				bli.add(new BookStore(btitle,bAuth,bgen,bPrice,bId));
				
				for(int i=0; i<bli.size(); i++) {
					System.out.println(bli.get(i));
				}
				
			}else if(sign==3) {
				System.out.println("Enter books id to remove book : ");
				int bIdRem = sc.nextInt();
				
				for(int i=0; i<bli.size(); i++) {
					if(bIdRem==bli.get(i).getId()) {
						bli.remove(i);
					}
				}
				
				for(int i=0; i<bli.size(); i++) {
					System.out.println(bli.get(i));
				}
				
			}else if(sign==4) {
				for(int i=0; i<bli.size(); i++) {
					System.out.println(bli.get(i));
				}
				
				System.out.println("Enter book id for view");
				int bIdSear = sc.nextInt();
				
				for(int i=0; i<bli.size(); i++) {
					if(bIdSear==bli.get(i).getId()) {
						System.out.println(bli.get(i));
					}
				}
				
			}else {
				System.out.println("Enter valid output");
			}
			
			
		}while(sign!=0);
		
		
		
		sc.close();
	}

}
