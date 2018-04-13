package zadaci_2018_04_02;

import java.util.Scanner;

public class SwitchNumLocationInWords {

	public static void main(String[] args) {
		//0asdasd9 pretvara u 9asdasd0
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a string");
		String input = scan.nextLine();
		switchNumLocations(input);
		scan.close();
	}
	
	private static void switchNumLocations(String input){
		int counterOfNums = 0;
		for(int i = 0; i < input.length(); i++) {
			if(Character.isDigit(input.charAt(i))) counterOfNums++;
		}
		char[] numOfNums = new char[counterOfNums];
		
		int counter = 0;
		for(int i = 0; i < input.length(); i++) {
			if(Character.isDigit(input.charAt(i))) {
				if(counter % 2 == 0) {
					numOfNums[counter + 1] = input.charAt(i);
					counter++;
				}
				else {
					numOfNums[counter - 1] = input.charAt(i);
					counter++;
				}
			}
		}
	
		
		int locationPointer = 0;
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < input.length(); i++) {
			if(Character.isDigit(input.charAt(i))) {
				sb.append(numOfNums[locationPointer]);
				locationPointer++;
			}
			else {
				sb.append(input.charAt(i));
			}
		}
		
		System.out.println(sb.toString());
		
	}

}
