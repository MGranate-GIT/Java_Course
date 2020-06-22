// FileWriter - writing stream of the characters in files
// BufferedWriter - faster

//new FileWriter(path) - creates/recreates file
//new FileWriter(path, true) - adds in existent file

package Application;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WritingFiles_1 {

	public static void main(String[] args) {

		String[] lines = new String[] { "Hello im manuel", "I am person", "I am true" };

		String path = "D:\\WORK\\Desktop\\testOut.txt";

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))) {
			
			for (String line : lines) {
				bw.write(line);
				bw.newLine();
			}

		} 
		catch (IOException e) {
			e.printStackTrace();	
		}
	}
}