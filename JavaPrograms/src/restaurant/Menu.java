package restaurant;

public class Menu {
	private String name;
	private String desc;
	private double price;
	private String catg;
	
	public Menu (String name, String desc, double price, String catg) {
		this.name = name;
		this.desc = desc;
		this.price = price;
		this.catg=catg;
	}
	
	//getter
	public String getName() {
		return name;
	}
	
	public String getDesc() {
		return desc;
	}
	
	public double getPrice() {
		return price;
	}
	
	public String getCatg() {
		return catg;
	}
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	
	public void setDesc(String desc) {
		this.desc = desc;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public void setCatg(String catg) {
		this.catg = catg;
	}
	
	public String toString() {
		return "( "+"Name:"+getName()+" , Description:"+getDesc()+" , Price:"+getPrice()+" , Category:"+getCatg()+" )" ;
	}
	
}
