// Day 3 Using BufferedReader

package dayThree;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProjectThree {

	public static void main(String[] args) {
		readFile("C:\\Users\\Anjanee Sewvandika\\Documents\\\\Credentials.txt");
	}
	
	public static void readFile(String filePath) {
		BufferedReader br = null;
		
		try {
			br = new BufferedReader(new FileReader(filePath));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.err.println(e.getMessage());
		} catch(IOException e) {
			System.err.println(e.getMessage());
		} finally {
			try {
				if (br != null) {
					br.close();
				} 
			} catch (IOException e) {
				System.err.println(e.getMessage());
			}
		}
	}

}
