package iostreams;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class PrintWriterExample {
	public static void main(String[] args) {

		String outputFile = "C:\\Mayur\\dev\\RadicalTechnologiesJava\\src\\iostreams\\output.txt";

		try (PrintWriter printWriter = new PrintWriter(new FileWriter(outputFile))) {
			printWriter.println("This is an example using PrintWriter.");
			printWriter.println("Writing data line by line is easy.");
			System.out.println("Data written successfully using PrintWriter.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
