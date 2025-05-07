package day_1;

public class PerfectNumbers {

public static void main(String[] args) {
		
		for(int j = 1; j <= 1000; j++) {
			int sumOfFactors = 0;	
			for(int i = 1; i < j;i++) {
				if(j % i == 0) {
					sumOfFactors += i;
				}
			}
			if(sumOfFactors == j) {
				System.out.println("Perfect Number : " + j);
			}
		}	
 }
}
