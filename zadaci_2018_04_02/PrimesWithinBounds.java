package zadaci_2018_04_02;

import java.util.Scanner;

public class PrimesWithinBounds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter two nums");
		
		try {
			int lowerBound = scan.nextInt();
			int upperBound = scan.nextInt();
			findPrimes(Math.min(lowerBound, upperBound), Math.max(lowerBound, upperBound));
		} catch (IllegalArgumentException ex) {
			ex.printStackTrace();
		}
		
		scan.close();
	}
	
	private static void findPrimes(int first, int second) {
		for(int i = first; i <= second; i++) {
			if(isPrime(i))
				System.out.println(i);
		}
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
	
}
