package day_5;

public class NeonNumber {
	public static int sumOfDigits(int n) {
		int sum = 0;
		while(n > 0) {
			int digit = n % 10;
			sum += digit;
			n/=10;
		}
		return sum;
	}
	
	public static void main(String[] args) {
		int n = 9;
		int square = n*n;
		
		if(n == sumOfDigits(square)) {
			System.out.println("Neon Number : "+ n);
		}else {
			System.out.println("Not a Neon Number : "+ n);
		}
		
	}

}
