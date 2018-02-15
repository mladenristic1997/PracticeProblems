package zadaci_14_02_2018;

public class CountNumberOfLetters {
	public static int countLetters(String s) {
      
		int lettersCount = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isLetter(s.charAt(i))) {
                lettersCount++;
            }
        }
        return lettersCount;

    }
}
