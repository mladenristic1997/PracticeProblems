package zadaci_2018_04_02;

import java.util.Scanner;

public class SumOf1_3_5Coins {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Unesi vrijednost u markama");
		int unos = -1;
		while(unos < 0)
			unos = scan.nextInt();
		
		int temp = unos;
		int petMaraka = temp / 5;
		if(petMaraka > 0)
			temp -= petMaraka * 5;
		
		int triMarke = temp / 3;
		if(triMarke > 0)
			temp -= triMarke * 3;
		
		int jednaMarka = temp;
		
		int ukupno = petMaraka + triMarke + jednaMarka;
		System.out.println(unos + " maraka se moze isplatiti kao: " + petMaraka + " petaka " + triMarke + " po tri marke i " + jednaMarka + " po marku");
		System.out.println("To je ukupno " + ukupno + " novcica");
		
		scan.close();
	}

}
