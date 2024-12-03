package example;

import java.io.*;

public class ExceptionDemo {
	public static void main(String[] args) {
		// Unchecked Exception (ArithmeticException)
		try {
			int result = 10 / 0;
			System.out.println("Result: " + result);
		} catch (ArithmeticException e) {
			System.out.println("unchecked exception : " + e.getMessage());
		}

		// Checked Exception (FileNotFoundException)
		try {
			FileReader file = new FileReader("abc.txt");
		} catch (FileNotFoundException e) {
			System.out.println("Checked exception: " + e.getMessage());

		}

	}

}
