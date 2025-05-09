package day_3;

public class CountEvenDigits {

	public static void main(String[] args) {
		int n = 12345678;
		
		int temp = n;
		int count = 0;
		
		while(temp > 0) {
			int rem = temp%10;
			if(rem % 2 ==0) {
				count++;
			}
			temp /= 10;
			
		}
		System.out.println("count of even number : " + count);
	}
}
