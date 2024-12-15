package iostreams;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {
	public static void main(String[] args) {

		String outputFile = "C:\\Mayur\\dev\\RadicalTechnologiesJava\\src\\iostreams\\output.txt";

		try (BufferedOutputStream bufferedOutput = new BufferedOutputStream(new FileOutputStream(outputFile))) {
			String content = "This is an example using BufferedOutputStream.";
			bufferedOutput.write(content.getBytes());
			System.out.println("Data written successfully using BufferedOutputStream.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
