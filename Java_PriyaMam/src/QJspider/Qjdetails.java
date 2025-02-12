package QJspider;

public class Qjdetails {
	private String name;
	private int id;
	private  long mob;
	
	public Qjdetails(String name, int id, long mob) {
		this.name = name;
		this.id = id;
		this.mob = mob;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getMob() {
		return mob;
	}

	public void setMob(long mob) {
		this.mob = mob;
	}
	
	
	@Override
	public String toString() {
		return "[ "+"Name:"+getName()+" , "+"Id:"+getId()+" , "+"Mob_no:"+getMob()+" ]" ;
	}
	
	
}
