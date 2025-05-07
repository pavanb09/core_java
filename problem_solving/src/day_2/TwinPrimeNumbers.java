package day_2;

public class TwinPrimeNumbers {
	
	public static boolean isPrime(int n) {
		
		boolean status = true;
		for(int i = 2; i<n; i++) {
			if(n % i == 0) {
				status = false;
			}
		}
		return status;
	}

	public static void main(String[] args) {
		int n = 60;
// "why we take n - 2; because we don't want n and n+2 we stop before n so we use - 2" 
		
		for(int i = 2; i<= (n-2); i++) { 
			if(isPrime(i) && isPrime(i + 2)) {
				
				System.out.println("(" + i + "," + (i+2) + ")");
			}
		}
	}

	
}
