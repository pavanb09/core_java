package blc_elc;

public class MainCircle {
	public static void main(String[] args) {
		
		Circle cir=new Circle();
		Circle cir2 = new Circle();
		
		
		cir.setradius(18);
		cir2.setradius(25);
		
		System.out.println("Circle object 1 : ");
		System.out.println("The radius of circle is : " +cir.getradius() );
		System.out.println("The area of Circle      : " +cir.getAreaofCircle());
		System.out.println("Circumference of Circle : " + cir.getCircumference());
		System.out.println("-----------------------------");
		
		System.out.println("Circle object 2 : ");
		System.out.println("The radius of circle is : " +cir2.getradius() );
		System.out.println("The area of Circle      : " +cir2.getAreaofCircle());
		System.out.println("Circumference of Circle : " + cir2.getCircumference());
	}
}
