package setsdemo;

import java.util.Set;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

    public static void main(String[] args) {
        Set<String> s3 = new LinkedHashSet<>(); 

        s3.add("Banana");
        s3.add("Apple");
        s3.add("Mango");
        s3.add("Grapes");

        // Printing the elements (Insertion order)
        System.out.println("LinkedHashSet: " + s3);
    }
}
