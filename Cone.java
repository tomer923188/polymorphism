public class Cone extends Circle {
private double height;
public Cone(Point center, double radius, double height) {
	super(center,(int)radius);
	this.height = height;
}
public double getHeight() {
return height;
}
public void setHeight(double height) {
this.height = height;
}
public double baseArea() {
return super.getArea();
}
/** משופע אורך l = sqrt(r^2 + h^2) */
public double slantHeight() {
return Math.sqrt(super.radius * super.radius + height * height);
}
/* πrl :שטח מעטפת **/
public double lateralSurfaceArea() {
return Math.PI * super.radius * slantHeight();
}
/** כולל שטח: πr(r + l) */
public double totalSurfaceArea() {
return Math.PI * super.radius * (super.radius + slantHeight());
}
/** נפח:) πr2h)/3 */
public double volume() {
return (Math.PI * super.radius * super.radius * height) / 3.0;
}
public String toString() {
return "cone= "+"radius="+super.radius+" center="+super.center+" height="+height;
}
}