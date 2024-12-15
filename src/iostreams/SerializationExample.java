package iostreams;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationExample {
	public static void main(String[] args) {

		Student student = new Student(1, "Mayur");
		try (ObjectOutputStream oos = new ObjectOutputStream(
				new FileOutputStream("C:\\Mayur\\dev\\RadicalTechnologiesJava\\src\\iostreams\\student.ser"))) {
			oos.writeObject(student);
			System.out.println("Student object serialized successfully.");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
