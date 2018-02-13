package zadaci_12_02_2018;

import java.util.Random;

public class GenerateAndCountRepetitions {
	public static void main(String[] args) {
		generateAndCountRepetitions();
	}
	
	public static void generateAndCountRepetitions() {
		Random rand = new Random();
		int[] repetitions = new int[10];
		for(int i = 0; i < 100; i++) {
			repetitions[rand.nextInt(10)]++;
		}
		for(int i = 0; i < repetitions.length; i++) {
			System.out.println(i + " repeated " + repetitions[i] + " times");
		}
	}
	
}
