package zadaci_14_02_2018;

public class MoneySaving {

	    public static double monthlySaving(double monthlyPayment, int numberOfMonths) {

	        final int YEARLY_INTEREST_RATE = 5;
	        double total = 0;
	        for (int i = 0 ; i < numberOfMonths ; i++) {
	            total = (monthlyPayment + total) * (1 + ((double)YEARLY_INTEREST_RATE)/100/12);
	        }
	        return total;
	    }
	
}
