package classAssign.Array;

public class Studentss {
	private String name;
	private int rollno;
	private byte age;
	private long mob;
	
	public Studentss() {
		super();
	}
	
	public Studentss(String name, int rollno, byte age, long mob) {
		super();
		this.name = name;
		this.rollno = rollno;
		this.age = age;
		this.mob = mob;
	}
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public byte getAge() {
		return age;
	}

	public void setAge(byte age) {
		this.age = age;
	}

	public long getMob() {
		return mob;
	}

	public void setMob(long mob) {
		this.mob = mob;
	}

	@Override
	public String toString() {
		return "Studentss [name=" + name + ", rollno=" + rollno + ", age=" + age + ", mob=" + mob + "]";
	}


}
