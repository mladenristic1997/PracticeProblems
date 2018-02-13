package zadaci_13_02_2018;

public class PrimesBetweenTwoNumbers {
	
	public void printPrimesBetweenTwoNumbers(int first, int second, int perRow) {
		int counter = 0;
		for(int i = first; i < second; i++) {
			if(isPrime(i)) {
				if(counter % perRow == 0) {
					System.out.println(i + " ");
					counter++;
					continue;
				}
				System.out.print(i + " ");
				counter++;				
			}
		}
	}
	
	public boolean isPrime(int n) {
		for (int i = 2; i < n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
