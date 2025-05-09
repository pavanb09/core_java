package day_4;

public class SunnyNumber {
	
	public static boolean perfectSquare(int n) {
		boolean status = false;
		for(int i = 1; i<=n; i++) {
			if(i*i == n) {
				status = true;
				break;
			}
		}
		return status;
	}
	
	public static void main(String[] args) {
		int n = 101;
		
		if(perfectSquare(n+1)) {
			System.out.println("Sunny Number :" + n);
		}else {
			System.out.println("Not a Sunny Number : "+n);
		}
		
	}

}
