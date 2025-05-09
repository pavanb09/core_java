package day_4;

public class PerfectSquares1To1000 {
	
	public static void perfectSquare(int n) {
		for(int i = 1; i<=n; i++) {
			if(i*i == n) {
				System.out.println("Perfect Square : "+ n);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		for(int i = 1; i<= 1000; i++) {
			perfectSquare(i);
		}
		
	}
}
