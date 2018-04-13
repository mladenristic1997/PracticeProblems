package zadaci_2018_04_02;

import java.util.Scanner;

public class OnlyLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter string");
		String input = scan.nextLine();
		System.out.println(removeShit(input));
		scan.close();
	}
	
	private static String removeShit(String input) {
		StringBuffer sb = new StringBuffer();
		for(int i = 0; i < input.length(); i++) {
			if(Character.isLetter(input.charAt(i)) || input.charAt(i) == ' ') {
				sb.append(Character.toLowerCase(input.charAt(i)));
			}
		}
		return sb.toString();
	}

}
