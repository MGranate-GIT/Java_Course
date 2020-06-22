// FileReader - reading stream of the characters from files
// BufferedReader - faster

package Application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadingFiles_2 {
	
	public static void main(String[] args) {
		
		String path = "D:\\WORK\\Desktop\\testIn.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			// br = new BufferedReader(new FileReader(path));

			// OR
			
			fr = new FileReader(path);
			br = new BufferedReader(fr);

			String line = br.readLine();
			
			while (line != null) {
				System.out.println(line);
				line = br.readLine();
			}
		}
		catch (IOException e) {
		System.out.println("Error: " + e.getMessage());
		}
		finally { 
			try{
				if (br != null) {
					br.close();
				}
				if (fr != null) {
					br.close();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}	
	}
}

