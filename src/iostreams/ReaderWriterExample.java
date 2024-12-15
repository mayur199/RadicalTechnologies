package iostreams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReaderWriterExample {
	public static void main(String[] args) {
		
		String inputFile = "C:\\Mayur\\dev\\RadicalTechnologiesJava\\src\\iostreams\\input.txt"; 
		String outputFile = "C:\\Mayur\\dev\\RadicalTechnologiesJava\\src\\iostreams\\output.txt";

		try (BufferedReader reader = new BufferedReader(new FileReader(inputFile));
				FileWriter writer = new FileWriter(outputFile)) {

			String line;
			while ((line = reader.readLine()) != null) {
				writer.write(line + System.lineSeparator());
			}
			System.out.println("File copied successfully using Reader and Writer classes.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
