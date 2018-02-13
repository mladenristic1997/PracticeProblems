package zadaci_13_02_2018;

public class EqualArrays {
	
	public static boolean equals(int[] niz1, int[] niz2) {
		for(int i = 0; i < Math.min(niz1.length, niz2.length); i++) {
			if(niz1[i] != niz2[i])
				return false;
		}
		return true;
	}
	
}
