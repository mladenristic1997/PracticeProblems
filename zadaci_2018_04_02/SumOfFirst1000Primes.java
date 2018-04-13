package zadaci_2018_04_02;

public class SumOfFirst1000Primes {

	public static void main(String[] args) {
		sumOfFirst1000Primes();
	}
	
	private static boolean isPrime(int n) {
	    //check if n is a multiple of 2
	    if (n%2==0) return false;
	    //if not, then just check the odds
	    for(int i=3;i*i<=n;i+=2) {
	        if(n%i==0)
	            return false;
	    }
	    return true;
	}
	
	private static void sumOfFirst1000Primes() {
		int count = 0;
		int checkPrime = 2;
		int sumOfPrimes = 0;
		while(count <= 1000) {
			
			if(isPrime(checkPrime)) {
				sumOfPrimes += checkPrime;
				count++;
			}
			checkPrime++;
		}
		
		System.out.println(sumOfPrimes);
	}

}
