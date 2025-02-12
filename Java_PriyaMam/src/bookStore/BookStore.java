package bookStore;

public class BookStore {
	
	private String title;
	private String author;
	private String genre;
	private double price;
	private int id;
	
	
	public BookStore(String title, String author, String genre, double price, int id) {
		this.title = title;
		this.author = author;
		this.genre = genre;
		this.price = price;
		this.id = id;
	}
	
	//Getter
	
	public String getTitle() {
		return title;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public String getGenre() {
		return genre;
	}
	
	
	public double getPrice() {
		return price;
	}
	
	public int getId() {
		return id;
	}
	
	
	//Setter
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public void setGenre(String genre) {
		this.genre = genre;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	

	@Override
	public String toString() {
		
		return "( "+"Title:"+getTitle()+" , "+"Author:"+getAuthor()+" , "+"Genre:"+getGenre()+" , "+"Price:"+getPrice()+" , "+"Id:"+getId()+" )" ;
	}
	
}
