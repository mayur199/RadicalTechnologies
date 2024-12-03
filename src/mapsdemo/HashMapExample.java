package mapsdemo;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
	public static void main(String[] args) {

		Map<String, String> hashMap = new HashMap<>();

		hashMap.put("1", "Apple");
		hashMap.put("2", "Banana");
		hashMap.put("3", "Cherry");

		System.out.println("HashMap: " + hashMap);

		System.out.println("Value for key '1': " + hashMap.get("1"));
	}
}
