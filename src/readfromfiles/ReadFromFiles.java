package readfromfiles;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadFromFiles {

	public static void main(String[] args) {
		
		String filename = "HELLO.txt";
		File textfile = new File(filename);
		
		try {
			Scanner readfile = new Scanner(textfile);
			while (readfile.hasNextLine()) {
				String Line = readfile.nextLine();
				System.out.println(Line);
				
			}
			readfile.close();

		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("File not found");
		}
		
	}

}
