package zadaci_2018_04_02;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PrintFromFileFirst55Chars {

	public static void main(String[] args) {
		
		
		Path file = Paths.get("Enter your path here");
		try {
			BufferedReader reader = Files.newBufferedReader(file);
			String line = "";
			while((line = reader.readLine()) != null) {
				if(line.length() <= 55) {
					System.out.println(line);
				}
				else {
					for(int i = 0; i < 40; i++) {
						System.out.print(line.charAt(i));
					}
					System.out.print("... <Read More>");
					System.out.println();
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}


	}
}
