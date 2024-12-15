package iostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderExample {
	public static void main(String[] args) {

		String inputFile = "C:\\Mayur\\dev\\RadicalTechnologiesJava\\src\\iostreams\\input.txt";

		try (BufferedReader bufferedReader = new BufferedReader(new FileReader(inputFile))) {
			String line;
			while ((line = bufferedReader.readLine()) != null) {
				System.out.println(line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
