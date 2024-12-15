package iostreams;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class BufferedInputStreamExample {
	public static void main(String[] args) {
		
		String inputFile = "C:\\Mayur\\dev\\RadicalTechnologiesJava\\src\\iostreams\\input.txt";

		try (BufferedInputStream bufferedInput = new BufferedInputStream(new FileInputStream(inputFile))) {
			int data;
			while ((data = bufferedInput.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
