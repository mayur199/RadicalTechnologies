package mapsdemo;

import java.util.Map;
import java.util.LinkedHashMap;

public class LinkedHashMapExample {
	public static void main(String[] args) {
		Map<String, String> linkedHashMap = new LinkedHashMap<>();

		linkedHashMap.put("3", "Cherry");
		linkedHashMap.put("1", "Apple");
		linkedHashMap.put("2", "Banana");

		// Display (insertion order)
		System.out.println("LinkedHashMap: " + linkedHashMap);

		System.out.println("Value for key '2': " + linkedHashMap.get("2"));
	}
}
