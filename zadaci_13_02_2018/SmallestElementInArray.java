package zadaci_13_02_2018;

public class SmallestElementInArray {
		
	public static double min(double[] array) {
		double smallest = array[0];
		for(int i = 0; i < array.length; i++) {
			if(array[i] < smallest) {
				smallest = array[i];
			}
		}
		return smallest;
	}

}
