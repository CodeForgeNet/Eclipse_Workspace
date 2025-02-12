package classAssign.Array;

public class Circle {
	float radius;
	float area = 22/7*radius*radius;
	float diam = 2*radius;

	public Circle(float radius, float area, float diam) {
		super();
		this.radius = radius;
		this.area = area;
		this.diam = diam;
	}
	
	@Override
	public String toString() {
		return "Circle [radius=" + radius + ", area=" + area + ", diam=" + diam + "]";
	}
	

}
