package day_3;

public class ReverseNumbers {
	
	public static int  reverseNumber(int n) {
		int reverse = 0;
		while(n > 0) {
			int remainder = n % 10;
			reverse = reverse * 10 + remainder;
			n /= 10;
		}
		return reverse;
	}

	public static void main(String[] args) {
		
		for(int i = 1; i<= 1000; i++) {
			System.out.println(i + " : " + reverseNumber(i));
		}
	}
}
