package zadaci_15_02_2018;

public class ReverseNumber {
	
	public static int reverse(int number) {
		
		String num = "" + number;
		StringBuilder sb = new StringBuilder();
		for(int i = num.length() - 1; i >= 0; i--) {
			sb.append(num.charAt(i));
		}
		String reverseNum = sb.toString();
		
		return Integer.parseInt(reverseNum);
		
	}
	
	public static boolean isPalindrome(int number) {
		
		String num = "" + number;
		String reverse = "" + reverse(number);
		
		if(num.equals(reverse)) return true;
		
		return false;
	}
	
}
