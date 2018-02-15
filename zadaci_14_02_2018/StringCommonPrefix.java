package zadaci_14_02_2018;

public class StringCommonPrefix {

    public static String commonPrefix(String input1, String input2) {
        StringBuilder sb = new StringBuilder();
 
        for (int i = 0 ; i < Math.min(input1.length(), input2.length()) ; i++) {
        	if (input1.charAt(i) == input2.charAt(i)) {
        		sb.append(input1.charAt(i));
        	}
            else break;
        }
        return sb.toString();
    }

}