package day_3;


import java.util.Scanner;

public class WhileLoopProblems {
	
	public static void IsPrimeNumber(int n) {
		boolean isCheck = true;
		
		for(int i = 2; i<n; i++) {
			if(n % i == 0) {
				isCheck = false;
			}
		}
		if(isCheck) {
			System.out.println("Given number is a Prime Number");
		}else {
			System.out.println("Given number is not Prime Number");
		}
	}
	
	public static void factors(int n) {
		System.out.println("Factors of given Number : ");
		for(int i = 1; i<= n; i++) {
			if(n % i == 0) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void palindromeNumber(int n) {
		int temp = n; 
		int rev = 0;
		while(temp > 0) {
			int rem = temp%10;
			rev = rev*10+ rem;
			temp /= 10;		}
		if(n == temp) {
			System.out.println("Given Number is a Palindrome Number");
		}else {
			System.out.println("Given Number is a not Palindrome Number");
		}
	}
	

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number");
		int n = sc.nextInt();
		
		int evenSum = 0;
		int oddSum = 0;
		
		int temp = n;
		while(temp > 0) {
			int remainder = temp % 10;
			
			if(remainder % 2 == 0) {
				evenSum += remainder;
			}else {
				oddSum += remainder;
			}
			temp /= 10;
		}
		
		if(evenSum > oddSum) {
			factors(n);
		}else if(evenSum < oddSum) {
			IsPrimeNumber(n);
		}else {
			palindromeNumber(n);
		}
		
		sc.close();
		
		
	}
}

