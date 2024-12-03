package mapsdemo;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {
	public static void main(String[] args) {
		Map<String, String> treeMap = new TreeMap<>();

		treeMap.put("3", "Cherry");
		treeMap.put("1", "Apple");
		treeMap.put("2", "Banana");

		// Display (sorted by key)
		System.out.println("TreeMap: " + treeMap);

		System.out.println("Value for key '3': " + treeMap.get("3"));
	}
}
