package setsdemo;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		Set<String> s1 = new TreeSet<>();

		s1.add("Banana");
		s1.add("Apple");
		s1.add("Mango");
		s1.add("Grapes");

		// Printing the element in Sorted order
		System.out.println("TreeSet: " + s1);
	}
}
