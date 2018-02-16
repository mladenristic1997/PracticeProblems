package zadaci_15_02_2018;

public class LeapYear {
	
	public static void printLeapYear(int first, int second) {
		
		int counter = 0;
		for(int i = Math.min(first, second); i < Math.max(first, second); i++) {
			
			 boolean isLeapYear = ((i % 4 == 0) && (i % 100 != 0) || (i % 400 == 0));

		        if (isLeapYear && counter % 10 == 0) {
		          System.out.println(i + " ");
		          counter++;
		        }
		        else if(isLeapYear && counter % 10 != 0) {
		        	System.out.print(i + " ");
		        	counter++;
		        }
			
		}
		
	}
	
}
