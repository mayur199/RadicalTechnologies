package example;

public class StringBufferMethodsExample {
	public static void main(String[] args) {
		// StringBuffer object
		StringBuffer sb = new StringBuffer("Hello, Mayur ");

		System.out.println("Length of StringBuffer: " + sb.length());

		System.out.println("Character at index 7: " + sb.charAt(7));

		System.out.println("Substring from index 7 to 12: " + sb.substring(7, 12));

		sb.append(" Let's learn.");
		System.out.println("After append: " + sb);

		sb.insert(7, "Java ");
		System.out.println("After insert: " + sb);

		sb.delete(7, 12);
		System.out.println("After delete: " + sb);

		sb.reverse();
		System.out.println("After reverse: " + sb);

		sb.reverse(); // Revert back to original order
		sb.replace(7, 20, "StringBuilder");
		System.out.println("After replace: " + sb);
        System.out.println("After changes StringBuffer: " + sb);

	}
}
