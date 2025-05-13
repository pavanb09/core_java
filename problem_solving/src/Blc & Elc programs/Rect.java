package blc_elc;

public class Rect {
	private double length;
	private double breadth;
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public double getLength() {
		return length;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public double getBreadth() {
		return breadth;
	}
	
	public double getArea() {
		double area = length * breadth;
		return area;
	}
	public double getParameter() {
		double parameter = (2 * (length + breadth));
		return parameter;
	}
	
}
