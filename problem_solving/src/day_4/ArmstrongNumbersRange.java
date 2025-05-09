package day_4;

public class ArmstrongNumbersRange {
	
	public static void armstrongNumber(int n) {
		int temp = n;
		int sum = 0;
		int count = 0;
		while(temp > 0) {
			count++;
			temp /= 10;
		}
		temp = n;
		while(temp>0) {
			int digit = temp%10;
			int fact = 1;
			for(int i = 1; i<= count; i++) {
				fact *= digit;
			}
			sum+= fact;
			temp /= 10;
		}
		if(sum == n) {
			System.out.println("Armstrong Number : "+ n);
		}
	}
	
	public static void main(String[] args) {
		for(int i = 1; i<= 1000;i++) {
			armstrongNumber(i);
		}
	}
}
