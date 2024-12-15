package example.exceptionhandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadStudentFromFile {

    public static void main(String[] args) {
        ObjectInputStream ois = null;
        try {
            File file = new File("C:\\Mayur\\dev\\RadicalTechnologiesJava\\src\\example\\exceptionhandling\\MyStudentObject.ser");
            if (!file.exists()) {
                System.out.println("Serialized file not found: " + file.getAbsolutePath());
                return;
            }
            ois = new ObjectInputStream(new FileInputStream(file));
            MyStudent student = (MyStudent) ois.readObject();
            System.out.println("Successfully read object: " + student);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("Error occurred while reading object from file.");
        } finally {
            if (ois != null) {
                try {
                    ois.close();
                    System.out.println("Stream closed successfully.");
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
