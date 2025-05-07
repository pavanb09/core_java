package day_1;

public class SumOfPerfectNumbers {
	
public static void main(String[] args) {
		
		int sumOfPerfectNumbers = 0;
		for(int i = 1; i<= 1000; i++) {
			int sumOfFactors = 0;
			
			for(int j = 1; j<i; j++) {
				if(i % j == 0) {
					sumOfFactors += j;
				}
			}
			if(sumOfFactors == i) {
				sumOfPerfectNumbers += i;
			}
		}
		System.out.println("Sum of Perfect Numbers : " + sumOfPerfectNumbers);
	}

}
