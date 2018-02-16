package zadaci_15_02_2018;

public class InvestValue {
	
	public static double calculateValue(double investValue, int numOfYears, double interestRateInMonths) {
		
		return investValue * Math.pow((1 + interestRateInMonths), numOfYears * 12);
		
	}
	
}
