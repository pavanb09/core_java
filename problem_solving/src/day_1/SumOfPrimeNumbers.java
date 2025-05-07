package day_1;

public class SumOfPrimeNumbers {
	
	public static void main(String[] args) {
//		2 to 200 Sum of Prime numbers 
		int sumOfPrimeNumbers = 0;
		
		for(int i = 2; i<= 200; i++) {
			int count = 0;
			for(int j = 1; j <= i; j++) {
				if(i % j == 0) {
					count++;
				}
			}
			if(count == 2) {
				sumOfPrimeNumbers += i;
			}
		}
		
		System.out.println("Sum of Prime Numbers 2 to 200 : " + sumOfPrimeNumbers);
	}

}
