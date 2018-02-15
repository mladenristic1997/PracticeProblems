package zadaci_14_02_2018;

import java.util.Random;

public class RandomCard {
	
	public static void drawCard() {
		Random rand = new Random();
		int num = 1 + rand.nextInt(13);
		int type = rand.nextInt(4);
		switch(num) {
			case 1:
				System.out.println("A"); break;
			case 2:
				System.out.println("2"); break;
			case 3:
				System.out.println("3"); break;
			case 4:
				System.out.println("4"); break;
			case 5:
				System.out.println("5"); break;
			case 6:
				System.out.println("6"); break;
			case 7:
				System.out.println("7"); break;
			case 8:
				System.out.println("8"); break;
			case 9:
				System.out.println("9"); break;
			case 10:
				System.out.println("10"); break;
			case 11:
				System.out.println("J"); break;
			case 12:
				System.out.println("Q"); break;
			case 13:
				System.out.println("K"); break;
			default:
				System.out.println("Jebije");
		}
		switch(type) {
			case 0:
				System.out.println("Pik"); break;
			case 1:
				System.out.println("Srce"); break;
			case 2:
				System.out.println("Djetelina"); break;
			case 3:
				System.out.println("Kocka"); break;
			default: break;
		}
	}
}
