package example;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionHandlingDemo {
	public static void main(String[] args) {
		// Unchecked Exception Example
		try {
			int[] numbers = { 1, 2, 3 };
			System.out.println("Accessing element: " + numbers[3]); // ArrayIndexOutOfBoundsException
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Caught an unchecked exception: " + e.getMessage());
		}

		// Checked Exception Example
		try {
			File file = new File("file.txt");
			Scanner scanner = new Scanner(file); // FileNotFoundException
		} catch (FileNotFoundException e) {
			System.out.println("Caught a checked exception: " + e.getMessage());
		}

	}
}
