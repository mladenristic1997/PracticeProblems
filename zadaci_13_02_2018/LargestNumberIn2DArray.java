package zadaci_13_02_2018;

public class LargestNumberIn2DArray {
	
	public static int[] locateLargest(double[][] a) {
		int[] location = new int[2];
		double largest = a[0][0];
		location[0] = 0;
		location[1] = 0;
		
		for(int i = 0; i < a.length; i++) {
			for(int k = 0; k < a[0].length; k++) {
				if(a[i][k] > largest) {
					largest = a[i][k];
					location[0] = i;
					location[1] = k;
				}
			}
		}
		
		return location;
	}

	
}
