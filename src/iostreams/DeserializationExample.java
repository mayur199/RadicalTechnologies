package iostreams;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeserializationExample {
	public static void main(String[] args) {
		
		try (ObjectInputStream ois = new ObjectInputStream(
				new FileInputStream("C:\\Mayur\\dev\\RadicalTechnologiesJava\\src\\iostreams\\student.ser"))) {
			Student student = (Student) ois.readObject();
			System.out.println("Deserialized Student: " + student);
		} catch (IOException | ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
