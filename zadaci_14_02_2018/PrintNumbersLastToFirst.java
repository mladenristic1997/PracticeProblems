package zadaci_14_02_2018;

public class PrintNumbersLastToFirst {
	
	public static int[] reverseArray(int[] array) {
        int[] reverse = new int[array.length];
        for(int i = 0; i < array.length; i++) {
        	reverse[i] = array[array.length - 1 - i];
        }
        return reverse;
    }
}
