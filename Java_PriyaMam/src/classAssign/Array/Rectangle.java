package classAssign.Array;

public class Rectangle {
	float l ;
	float w;
	float square = l*w;
	float perm = 2*(l+2);
	
	public Rectangle(float l, float w, float square, float perm) {
		super();
		this.l = l;
		this.w = w;
		this.square = square;
		this.perm = perm;
	}

	@Override
	public String toString() {
		return "Rectangle [l=" + l + ", w=" + w + ", square=" + square + ", perm=" + perm + "]";
	}
	
	

}
