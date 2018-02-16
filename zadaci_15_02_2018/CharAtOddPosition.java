package zadaci_15_02_2018;

public class CharAtOddPosition {
	
	public static void printCharsAtOddPositions(String input) {
	
			for(int i = 1; i < input.length(); i += 2) {
				System.out.print(input.charAt(i));
			}
		
		
	}
	
}
