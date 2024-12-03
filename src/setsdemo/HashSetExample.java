package setsdemo;

import java.util.Set;
import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		Set<String> s2 = new HashSet<>(); 

		s2.add("Banana");
		s2.add("Apple");
		s2.add("Mango");
		s2.add("Grapes");

		// Printing the elements (Order is not guaranteed)
		System.out.println("HashSet: " + s2);
	}
}
