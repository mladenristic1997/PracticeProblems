package zadaci_12_02_2018;

public class CommonDivisor {
	
	public int GCD(int a, int b) {
		if (b == 0)
			return a;
		return GCD(b, a % b);
	}
}
