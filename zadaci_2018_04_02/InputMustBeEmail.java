package zadaci_2018_04_02;

import java.util.Scanner;

public class InputMustBeEmail {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		System.out.println(isEmail(input));
		scan.close();
	}
	
	public static boolean isEmail(String input) {
		return input.matches("\\b[\\w.%-]+@[-.\\w]+\\.[A-Za-z]{2,4}\\b");
	}

}
