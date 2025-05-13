package blc_elc;

public class MainRect {

	public static void main(String[] args) {
		
		Rect rectangle = new Rect();
		Rect rectangle1 = new Rect();
		
		rectangle.setLength(35);
		rectangle.setBreadth(20);
		System.out.println("For Object 1 :");
		System.out.println("length of rectange:" +rectangle.getLength());
		System.out.println("breadth of rectange:" +rectangle.getBreadth());
		System.out.println("Area of Rectangle : " + rectangle.getArea());
		System.out.println("Parimeter of Rectangle : "+ rectangle.getParameter());
		System.out.println("-----------------------------------------------------------------");

		rectangle1.setLength(50);
		rectangle1.setBreadth(30);
		System.out.println("For Object 2 :");
		System.out.println("length of rectange1:" +rectangle.getLength());
		System.out.println("breadth of rectange1:" +rectangle.getBreadth());
		System.out.println("Area of Rectangle : " + rectangle1.getArea());
		System.out.println("Parimeter of Rectangle : "+ rectangle1.getParameter());
	}
}
