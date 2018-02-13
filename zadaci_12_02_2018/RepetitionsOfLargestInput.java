package zadaci_12_02_2018;

import java.util.Scanner;

public class RepetitionsOfLargestInput {
	
	public static void main(String[] args) {
		int a = repetitionsOfLargestInput();
		System.out.println(a);
	}
	
	public static int repetitionsOfLargestInput(){
		Scanner scan = new Scanner(System.in);
		int input = -1;
		int largest = input;
		int repetitions = 0;
		
		while(input != 0) {
			System.out.println("Enter a number");
			try {
				input = scan.nextInt();
			}
			catch(Exception e) {
				System.out.println("Input is not a number");
				scan.close();
				return repetitions;
			}
	
			if(input > largest) {
				largest = input;
				repetitions = 1;
				continue;
			}
			if(input == largest) {
				repetitions++;
			}
			
		}
		scan.close();
		return repetitions;
	}
	
}
