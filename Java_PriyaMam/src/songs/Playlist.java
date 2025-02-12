package songs;

public class Playlist {
	
	String songName;
	String singerName;
	String genre;
	int id;
	int launchYear;
	
	
	public Playlist(String songName, String singerName, String genre, int id, int launchYear) {
		this.songName = songName;
		this.singerName = singerName;
		this.genre = genre;
		this.id = id;
		this.launchYear = launchYear;
	}

	@Override
	public String toString() {
		return "( "+songName + " , "+singerName+" , "+genre+" , "+id+" , "+launchYear+" )" ;
	}
	

}
