package mapsdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;
import java.util.LinkedHashMap;

public class MapExample {
	public static void main(String[] args) {
		// HashMap: No ordering, allows null values
		Map<String, String> hashMap = new HashMap<>();
		hashMap.put("1", "Apple");
		hashMap.put("2", "Banana");
		hashMap.put("3", "Cherry");

		// TreeMap: Sorted by key
		Map<String, String> treeMap = new TreeMap<>();
		treeMap.put("1", "Apple");
		treeMap.put("2", "Banana");
		treeMap.put("3", "Cherry");

		// LinkedHashMap: Maintains insertion order
		Map<String, String> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("1", "Apple");
		linkedHashMap.put("2", "Banana");
		linkedHashMap.put("3", "Cherry");

		// Display maps
		System.out.println("HashMap: " + hashMap);
		System.out.println("TreeMap: " + treeMap);
		System.out.println("LinkedHashMap: " + linkedHashMap);
	}
}
