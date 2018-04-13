package zadaci_2018_04_02;

import java.util.ArrayList;
import java.util.Scanner;

public class FirstNonrepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		String input = scan.nextLine();
		firstNonRepeatingChar(input);
		scan.close();
	}
	

	public static void firstNonRepeatingChar(String a) {
		//Za uop�teno neponavljanje karaktera u stringu
		ArrayList<Character> niz = new ArrayList<Character>();
		for(int i = 0; i < a.length(); i++)
			niz.add(a.charAt(i));
		
		niz.trimToSize();
		for(int i = 0; i < niz.size(); i++)
		{
			char c = niz.remove(i);
			if(niz.contains(c))
			{
				for(int k = 0; k < niz.size(); k++)
				{
					if(niz.get(k) == c)
					{
						niz.remove(k);
						k -= 1;
					}
				}
				
			i -= 1;
			}
			else
			{
				System.out.println("Prvi karakter kojeg nema u stringu je " + c);
				break;
			}
			niz.trimToSize();
		}
	}
}
