package dayThree;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SimpleFileReader {

	public static void main(String[] args) {
		
		try {
			BufferedReader br = new BufferedReader(new FileReader 
					("C:\\Users\\Anjanee Sewvandika\\Documents\\\\Credentials.txt"));
			String line;
			while ((line = br.readLine()) != null) {
				System.out.println(line);
			}
			
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
