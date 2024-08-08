package dayThree;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ProjectTwo {
	public static void main(String[] args) {
		BufferedReader br = null; 
		try {
			br = new BufferedReader(new FileReader
			("C:\\Users\\Anjanee Sewvandika\\Documents\\\\Credentials.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
		} catch (FileNotFoundException e) {
			System.out.println("File not found: "+ e.getMessage());
		} catch (IOException e) {
			System.out.println("Error reading file: "+ e.getMessage());
		} finally {
			try {
				if (br != null) {
					br.close();
				}
			} catch (IOException e) {
				System.err.println("Error closing file: " + e.getMessage());
			}
		}

	}
}
