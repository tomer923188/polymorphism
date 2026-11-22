
public class Circle {
	protected Point center;
	protected int radius;
	//constructor
	public Circle(Point center,int radius) {
		this.center = center;
		this.radius = radius;
	}
	//returns the circle area
	public double getArea() {
		return Math.PI*Math.pow(radius, 2);
	}
	//returns the perimeter
	public double getPerimeter() {
		return 2*Math.PI*radius;
	}
	//describes the circle
	public String toString() {
		return "The center: ("+center.getX()+","+center.getY()+")\n"+"The radius: "+radius;
	}
}
