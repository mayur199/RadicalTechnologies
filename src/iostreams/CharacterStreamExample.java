package iostreams;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CharacterStreamExample {
	public static void main(String[] args) {
		String inputFile = "C:\\Mayur\\dev\\RadicalTechnologiesJava\\src\\iostreams\\input1.txt";
		String outputFile = "C:\\Mayur\\dev\\RadicalTechnologiesJava\\src\\iostreams\\output1.txt";

		try (FileReader reader = new FileReader(inputFile); 
				FileWriter writer = new FileWriter(outputFile)) {

			int data;
			while ((data = reader.read()) != -1) {
				writer.write(data);
			}
			System.out.println("File copied successfully using Character Stream.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
