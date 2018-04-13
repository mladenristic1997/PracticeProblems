package zadaci_2018_04_02;

import java.util.ArrayList;
import java.util.Scanner;

public class NoRepeatingChars {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		nonRepeatingChars(input);
		scan.close();
	}
	
	public static void nonRepeatingChars(String a) {
		//Za uop�teno neponavljanje karaktera u stringu
		ArrayList<Character> niz = new ArrayList<Character>();
		for(int i = 0; i < a.length(); i++)
			niz.add(a.charAt(i));
		
		niz.trimToSize();
		for(int i = 0; i < niz.size() - 1; i++)
		{
			Character c = niz.get(i);
			for(int k = i + 1; k < niz.size(); k++) {
				if(niz.get(k) == c) {
					niz.remove(k);
					k--;
				}
			}
		}
		
		for(Character c : niz) {
			System.out.print(c);
		}
	}
	
}
