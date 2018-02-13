package zadaci_12_02_2018;

import java.util.Scanner;

public class NumberOfVowels {
	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println("Number of vowels is " + numberOfVowels(input));
		scan.close();
	}
	
	public static int numberOfVowels(String input) {
		input.toLowerCase();
		int counter = 0;
		for(int i = 0; i < input.length(); i++) {
			switch(input.charAt(i)) {
				case 'a':
					counter++;
					break;
				case 'e':
					counter++;
					break;
				case 'i':
					counter++;
					break;
				case 'o':
					counter++;
					break;
				case 'u':
					counter++;
					break;
				default: continue;
			}
		}
		return counter;
	}
	
}
