package day_3;

public class powers {
	public static void main(String[] args) {
		int number = 5;
		int power = 6; 
		
		 int prod = 1;
		for(int i = 1; i<= power; i++) {
			prod *= number; 
		}
		System.out.println("5 power 6 : "+prod);
	}
}
