package songs;

import java.util.*;


public class SongsMenu {

	public static void main(String[] args) {
		
		List<Playlist> sadSongs = new ArrayList<Playlist>();
		sadSongs.add(new Playlist("Bhula Dena","Arijit Singh","Sad",12,2016));
		sadSongs.add(new Playlist("Kabhi tumhe","Darshan Raval","Sad",14,2022));
		
		
		List<Playlist> partySongs = new ArrayList<Playlist>();
		partySongs.add(new Playlist("Party all night","Honey singh","Party",23,2018));
		partySongs.add(new Playlist("Brown Rang","Honey singh","Party",27,2020));
		
		List<Playlist> romanticSongs = new ArrayList<Playlist>();
		romanticSongs.add(new Playlist("Tum hi ho","Arijit","Romantic",35,2016));
		romanticSongs.add(new Playlist("Tose naina","Arijit","Romantic",39,2019));
		
		Scanner sc = new Scanner(System.in);
		int sign;
		
		do {
			System.out.println("Enter 1 for songs details.\nEnter 2 for add songs.\nEnter 3 for remove songs .\nEnter 4 for search songs by his Id.\nEnter 0 for exits. ");
			sign = sc.nextInt();
			
			if(sign==1) {
				System.out.println("\nSad Songs");
				for(int i=0; i<sadSongs.size(); i++) {
					System.out.println(sadSongs.get(i));
				}
				System.out.println("Party Songs");
				for(int i=0; i<partySongs.size(); i++) {
					System.out.println(partySongs.get(i));
				}
				System.out.println("Romantic Songs\n");
				for(int i=0; i<romanticSongs.size(); i++) {
					System.out.println(romanticSongs.get(i));
				}
			}else if(sign==2) {
				
				System.out.println("Enter S/s for add sad songs, P/p for party songs, R/r for romantic songs");
				char ch = sc.next().charAt(0);
				
				if(ch=='S'|| ch=='s') {
					System.out.println("Enter your song name");
					String sname = sc.next();
					System.out.println("Enter songs singer name");
					String singname= sc.next();
					System.out.println("Enter your song genre");
					String sgen = sc.next();
					System.out.println("Enter your book id");
					int sid = sc.nextInt();
					System.out.println("Enter your song launch year");
					int syear = sc.nextInt();
					
					
					
					sadSongs.add(new Playlist(sname,singname,sgen,sid,syear));
					
					for(int i=0; i<sadSongs.size(); i++) {
						System.out.println(sadSongs.get(i)+"\n");
					}
				}else if(ch=='P'||ch=='p') {
					System.out.println("Enter your song name");
					String sname = sc.next();
					System.out.println("Enter songs singer name");
					String singname= sc.next();
					System.out.println("Enter your song genre");
					String sgen = sc.next();
					System.out.println("Enter your book id");
					int sid = sc.nextInt();
					System.out.println("Enter your song launch year");
					int syear = sc.nextInt();
					
					
					
					partySongs.add(new Playlist(sname,singname,sgen,sid,syear));
					
					for(int i=0; i<partySongs.size(); i++) {
						System.out.println(partySongs.get(i)+"\n");
					}
					
				}else if(ch=='R'||ch=='r') {
					System.out.println("Enter your song name");
					String sname = sc.next();
					System.out.println("Enter songs singer name");
					String singname= sc.next();
					System.out.println("Enter your song genre");
					String sgen = sc.next();
					System.out.println("Enter your book id");
					int sid = sc.nextInt();
					System.out.println("Enter your song launch year");
					int syear = sc.nextInt();
					
					
					
					romanticSongs.add(new Playlist(sname,singname,sgen,sid,syear));
					
					for(int i=0; i<romanticSongs.size(); i++) {
						System.out.println(romanticSongs.get(i)+"\n");
					}
				}
				
				
				
				
			}else if(sign==3) {
				
				char ch;
				do {
					
				
				System.out.println("Enter S/s for add sad songs, P/p for party songs, R/r for romantic songs");
				ch = sc.next().charAt(0);
				
				if(ch=='S'|| ch=='s') {
					
					System.out.println("Enter id to remove");
					int bIdRem = sc.nextInt();
					
					for(int i=0; i<sadSongs.size(); i++) {
						if(bIdRem==sadSongs.get(i).id) {
							sadSongs.remove(i);
						}
					}
					for(int i=0; i<sadSongs.size(); i++) {
						System.out.println(sadSongs.get(i)+"\n");
					}
					
				}else if(ch=='P'||ch=='p') {
					System.out.println("Enter id to remove");
					int bIdRem = sc.nextInt();
					
					for(int i=0; i<partySongs.size(); i++) {
						if(bIdRem==partySongs.get(i).id) {
							partySongs.remove(i);
						}
					}
					
					for(int i=0; i<partySongs.size(); i++) {
						System.out.println(partySongs.get(i)+"\n");
					}
					
				}else if(ch=='R'||ch=='r') {
					System.out.println("Enter id to remove");
					int bIdRem = sc.nextInt();
					
					for(int i=0; i<romanticSongs.size(); i++) {
						if(bIdRem==romanticSongs.get(i).id) {
							romanticSongs.remove(i);
						}
					}
					
					for(int i=0; i<romanticSongs.size(); i++) {
						System.out.println(romanticSongs.get(i)+"\n");
					}
				}
				}while(ch!='e'||ch!='E');
				
			}else if(sign==4) {
				
				
				char ch;
				do {
					System.out.println("Enter S/s for remove sad songs, P/p for party songs, R/r for romantic songs\nE/e for exit");
					ch=sc.next().charAt(0);
					if(ch=='s'||ch=='S') {
						System.out.println("Enter id");
						int siid=sc.nextInt();
						for(int i=0; i<sadSongs.size(); i++) {
							if(siid==sadSongs.get(i).id) {
								sadSongs.remove(i);
							}
						}
						
						for(int i=0; i<sadSongs.size(); i++) {
							System.out.println(sadSongs.get(i)+"\n");
						}
						
					}else if(ch=='P'|| ch=='p') {
						System.out.println("Enter id");
						int siid=sc.nextInt();
						for(int i=0; i<partySongs.size(); i++) {
							if(siid==partySongs.get(i).id) {
								partySongs.remove(i);
							}
						}
						
						for(int i=0; i<partySongs.size(); i++) {
							System.out.println(partySongs.get(i)+"\n");
						}
					}else if(ch=='r'||ch=='R') {
						System.out.println("Enter id");
						int siid=sc.nextInt();
						for(int i=0; i<romanticSongs.size(); i++) {
							if(siid==romanticSongs.get(i).id) {
								romanticSongs.remove(i);
							}
						}
						
						for(int i=0; i<romanticSongs.size(); i++) {
							System.out.println(romanticSongs.get(i)+"\n");
						}
					}else {
						System.out.println("Enter valid input");
					}
					
					
				}while(ch!='e'|| ch!='E');
				
				
				
				
				
			}else {
				System.out.println("Enter valid output");
			}
			
			
		}while(sign!=0);
		
		
		
		sc.close();
		

	}

}
