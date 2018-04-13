package zadaci_2018_04_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;

public class DeleteGivenCharsFromString {

	public static void main(String[] args) {

		Path file = Paths.get("Enter your path here");
		try {
			BufferedReader reader = Files.newBufferedReader(file);
			String line = "";
			ArrayList<Character> charsToRemove = new ArrayList<>();
			
			while((line = reader.readLine()) != null) {
				for(int i = 0; i < line.length(); i++) {
					if(line.charAt(i) == ',') {
						//preostale karaktere ubaci u array
						for(int k = i + 2; k < line.length(); k++) {
							charsToRemove.add(line.charAt(k));
						}
						break;
					}
				}
				
				//izbacivanje ostalih karaktera
				StringBuffer bf = new StringBuffer();
				for(int i = 0; i < line.length(); i++) {
					
					if(!charsToRemove.contains((Character)line.charAt(i))) {
						bf.append(line.charAt(i));
					}
					
					if(line.charAt(i) == ',') {
						break;
					}
				}
				
				System.out.println(bf.toString());
				
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
