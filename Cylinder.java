
public class Cylinder extends Circle{
	protected int height;
	//constructor
	public Cylinder(Point center,int radius, int height) {
		super(center, radius);
		this.height = height;
	}
	//returns the cylinder area
	public double getArea() {
		return super.getArea();
	}
	//returns the volume
	public double getVolume() {
		return height*super.getArea();
	}
	//describes the cylinder
	public String toString() {
		return "The center: ("+center.getX()+","+center.getY()+")\n"+"The radius: "+radius+"\n"+"Height: "+height;
	}
	// to answer the question, you can use center from Circle 
}
