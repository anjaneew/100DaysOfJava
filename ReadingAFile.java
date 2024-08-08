package dayThree;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadingAFile {

	public static void main(String[] args) throws FileNotFoundException, IOException {
		BufferedReader br = new BufferedReader(new FileReader ("D:\\Self Study\\Java\\dayThree\\src\\Going.txt"));

				String data = "";
		while ((data = br.readLine()) !=null) {
			System.out.println(data);
		}
	}

}
