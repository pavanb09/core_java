package day_4;

public class PerfectSquares {
	public static void main(String[] args) {
		int n = 16;
		boolean status = false;
		for(int i =1; i<=16;i++) {
			if(i*i == n) {
				status = true;
			}
		}
		if(status) {
			System.out.println("Perfect Square ");
		}else {
			System.out.println("Not a Perfect Square ");
		}
	}
}
