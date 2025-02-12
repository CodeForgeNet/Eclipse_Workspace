package classAssign.Array;

public class Square {
	float side;
	float area = side*side;
	float perm = 4*side;
	
	public Square(float side, float area, float perm) {
		super();
		this.side = side;
		this.area = area;
		this.perm = perm;
	}

	@Override
	public String toString() {
		return "Square [side=" + side + ", area=" + area + ", perm=" + perm + "]";
	}
	
	

}
