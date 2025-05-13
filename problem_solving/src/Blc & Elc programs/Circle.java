package blc_elc;

public class Circle {
	private double radius;
	
	public void setradius(double radius) {
		this.radius=radius;
	}
	public double getradius() {
		return radius;
	}
	public double getAreaofCircle() {
		double AreaofCircle=(Math.PI*(radius*radius));
		return AreaofCircle;
	}
	
	public double getCircumference() {
		double circumference = (2 * Math.PI * radius);
		return circumference;
	}
	
	

}
