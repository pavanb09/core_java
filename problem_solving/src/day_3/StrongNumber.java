package day_3;

import java.util.Scanner;

public class StrongNumber {
	
	public static void isStrongNumber(int n) {
		int temp = n;
		int sum=0;
		while(temp>0) {
			int rem = temp%10;
			int fact = 1;
			for(int i = 1; i<=rem;i++) {
				fact*=i;
			}
			sum+=fact;
			temp /= 10;
		}
		if(n == sum) {
			System.out.println("Strong Number : "+ n);
		}else {
			System.out.println("Not Strong Number : "+ n);
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your number : ");
		int n = sc.nextInt();
		
		isStrongNumber(n);
		sc.close();

	}

}
