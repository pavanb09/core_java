package day_5;

public class NeonNumber1To1000 {
	
	public static void NeonNumber(int n) {
		int square = n*n;
		int sum = 0;
		while(square>0) {
			int digit = square % 10;
			sum+=digit;
			square /= 10;
		}
		if(sum == n) {
			System.out.println("Neon Number : "+ n);
		}
	}
	
	
	public static void main(String[] args) {
		for(int i = 1; i<= 1000; i++) {
			NeonNumber(i);
		}
		
	}
}
