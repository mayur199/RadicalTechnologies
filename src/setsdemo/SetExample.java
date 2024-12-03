package setsdemo;

import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class SetExample {
	public static void main(String[] args) {
		Set<String> s1 = new TreeSet<>();
		Set<String> s2 = new HashSet<>();
		Set<String> s3 = new LinkedHashSet<>();

		s1.add("Apple");
		s1.add("Banana");
		s1.add("Cherry");

		s2.add("Apple");
		s2.add("Banana");
		s2.add("Cherry");

		s3.add("Apple");
		s3.add("Banana");
		s3.add("Cherry");

		System.out.println("TreeSet (s1): " + s1);
		System.out.println("HashSet (s2): " + s2);
		System.out.println("LinkedHashSet (s3): " + s3);
	}
}
