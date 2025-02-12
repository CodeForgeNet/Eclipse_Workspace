package classAssign.Array;

import java.util.Scanner;

public class MobileTask {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Mobile[] arr = new Mobile[5];
		
		for(int i=0;i<5;i++) {
			System.out.println("Enter "+(i+1)+" Mobile brand name : ");
			String name = sc.next();
			
			System.out.println("Enter "+(i+1)+" mobile id : ");
			byte id = sc.nextByte();
			
			System.out.println("Enter "+(i+1)+"Mobile price : ");
			float price = sc.nextFloat();
			
			arr[i]=new Mobile(name, id, price);
			
		}
		
		
		int sign;
		
		do {
			System.out.println("Enter '1' for details whose id is even & '2' for brand name whose Brand name start with vowel & '3' for highest price & '4' for lowest price  ");
			System.out.println("Enter 0 for exit ");
			sign = sc.nextInt();
			
			
			
			if(sign==1) {
				for(int i=0;i<5;i++) {
					if( arr[i].id % 2==0 ) {
						System.out.println("\n"+(i+1)+"Mobile"+arr[i]);
					}
				}
				
				
				
			}else if (sign==2) {
				for(int i=0; i<5;i++) {
					arr[i].brand.toLowerCase();
					if(arr[i].brand.charAt(0)== 'a' || arr[i].brand.charAt(0)== 'e' || arr[i].brand.charAt(0)== 'i' || arr[i].brand.charAt(0)== 'o' || arr[i].brand.charAt(0)== 'u') {
						System.out.println("\n"+arr[i].id+"Mobile"+arr[i]);
					}
				}
				
				
				
			}else if (sign==3) {
				float max = arr[0].price;
				Mobile mobile = arr[0];
				
				for(int i=1; i<5; i++) {
					if(max < arr[i].price) {
						max = arr[i].price;
						mobile = arr[i];
					}
				}
				System.out.println(mobile);
				
				
				
			}else if (sign==4) {
				float min = arr[0].price;
				Mobile mobile = arr[0];
				
				for(int i=1; i<5; i++) {
					if(min > arr[i].price) {
						min = arr[i].price;
						mobile = arr[i];
					}
				}
				System.out.println(mobile);
				
				
			}else {
				System.out.println("Exit");
			}
			
			
			
		} while (sign!=0);
		
		
		
		sc.close();
	}

}
