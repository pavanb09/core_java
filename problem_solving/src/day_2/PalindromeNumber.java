package day_2;

public class PalindromeNumber {


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
			if(i == reverseNumber(i)) {
				System.out.println("Palindrome Number  : " + i);
			}
		}
	}

}
