package iostreams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class ByteStreamExample {
	public static void main(String[] args) {
		String inputFile = "C:\\Mayur\\dev\\RadicalTechnologiesJava\\src\\iostreams\\input.txt"; 
		String outputFile = "C:\\Mayur\\dev\\RadicalTechnologiesJava\\src\\iostreams\\output.txt";

		try (FileInputStream input = new FileInputStream(inputFile);
				FileOutputStream output = new FileOutputStream(outputFile)) {

			int data;
			while ((data = input.read()) != -1) {
				output.write(data);
			}
			System.out.println("File copied successfully using Byte Stream.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
