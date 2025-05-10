package day_5;

public class PrimeNumbersNotPalindrome {
	
	public static boolean primeNumbers(int n) {
		boolean isCheck = true;
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				isCheck = false;
			}
		}
		return isCheck;
	}

	public static boolean palindromeNumber(int n) {
		int temp = n;
		int rev = 0;
		while (temp > 0) {
			int digit = temp % 10;
			rev = rev * 10 + digit;
			temp /= 10;
		}
		if (rev == n) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		for (int i = 2; i <= 1000; i++) {
			if (primeNumbers(i) && (!palindromeNumber(i))) {
				System.out.println("Prime Number and Not Palindrome : " + i);
			}

		}
	}


}
