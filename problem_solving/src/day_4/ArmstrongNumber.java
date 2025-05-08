package day_4;

import java.util.Scanner;

public class ArmstrongNumber {
	
	public static int digitCount(int n) {
		int count = 0;
		while(n>0) {
			count++;
			n /= 10;
		}
		return count;
	}
	
	public static int powerOf(int n, int p) {
		
		int prod = 1;
		for(int i = 1; i<= p;i++) {
			prod *= n;
		}
		return prod;
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your number : ");
		int n = sc.nextInt();
		
		int count = digitCount(n);
		int sumOf = 0;
		int temp = n;
	
		while(temp > 0) {
			int rem = temp%10;
			sumOf += powerOf(rem,count);
			temp /= 10;
		}
		
		if(sumOf == n) {
			System.out.println("Armstrong Number : "+n);
		}else {
			System.out.println("Not a ArmStrong Number : " + n);
		}
		
		sc.close();
	}
}
