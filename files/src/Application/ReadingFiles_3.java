// try-with-resources - declares one or more resources and assures that these are closed after the try block

package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles_3 {
	
	public static void main(String[] args) {
		
		String path = "D:\\WORK\\Desktop\\testIn.txt";
		
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
		System.out.println("Error: " + e.getMessage());
		}
		
	}	
}

