package example;

public class StringBufferMethodsEg {

	public int length(StringBuffer sb) {
		int i = 0;
		while (true) {
			try {
				sb.charAt(i);
				i++;
			} catch (StringIndexOutOfBoundsException e) {
				break;
			}
		}
		return i;
	}

	public String lowerCase(StringBuffer sb) {
		String result = "";
		int i = 0;

		while (true) {
			try {
				char c = sb.charAt(i);
				if (c >= 'A' && c <= 'Z') {
					c = (char) (c + 32); // Convert to lowercase
				}
				result += c;
				i++;
			} catch (StringIndexOutOfBoundsException e) {
				break;
			}
		}

		return result;
	}

	public String upperCase(StringBuffer sb) {
		String result = "";
		int i = 0;
		while (true) {
			try {
				char c = sb.charAt(i);
				if (c >= 'a' && c <= 'z') {
					c = (char) (c - 32); // Convert to uppercase
				}
				result += c;
				i++;
			} catch (StringIndexOutOfBoundsException e) {
				break;
			}
		}
		return result;
	}

	public String substring(StringBuffer sb, int start, int end) {
		String result = "";
		for (int i = start; i < end; i++) {
			result += sb.charAt(i);
		}
		return result;
	}

	public int indexOf(StringBuffer sb, char ch) {
		for (int i = 0; i < sb.length(); i++) {
			if (sb.charAt(i) == ch) {
				return i; // return index if character matches
			}
		}
		return -1; // return -1 if character is not found
	}

	public String append(StringBuffer sb, String str) {
		int len = sb.length(); // Get the current length of StringBuffer
		sb.setLength(len + str.length()); 
		for (int i = 0; i < str.length(); i++) {
			sb.setCharAt(len + i, str.charAt(i)); 
		}
		return sb.toString(); // Return the updated StringBuffer as a string
	}

	public String insert(StringBuffer sb, int index, String str) {
		String result = "";
		for (int i = 0; i < index; i++) {
			result += sb.charAt(i); // Copy characters before the index
		}
		for (int i = 0; i < str.length(); i++) {
			result += str.charAt(i); // Insert new string
		}
		for (int i = index; i < sb.length(); i++) {
			result += sb.charAt(i); // Copy remaining characters
		}
		return result;
	}

	public String delete(StringBuffer sb, int start, int end) {
		String result = "";
		for (int i = 0; i < start; i++) {
			result += sb.charAt(i); // Copy characters before the start
		}
		for (int i = end; i < sb.length(); i++) {
			result += sb.charAt(i); // Copy characters after the end
		}
		return result;
	}

	public String reverse(StringBuffer sb) {
		String result = "";
		for (int i = sb.length() - 1; i >= 0; i--) {
			result += sb.charAt(i); // Reverse the characters
		}
		return result;
	}

	public String replace(StringBuffer sb, int start, int end, String str) {
		String result = "";
		for (int i = 0; i < start; i++) {
			result += sb.charAt(i); // Copy characters before the start
		}
		for (int i = 0; i < str.length(); i++) {
			result += str.charAt(i); // Insert replacement string
		}
		for (int i = end; i < sb.length(); i++) {
			result += sb.charAt(i); // Copy remaining characters
		}
		return result;
	}

	public static void main(String[] args) {
		StringBufferMethodsEg eg = new StringBufferMethodsEg();
		StringBuffer sb = new StringBuffer("Hello, Welcome to India");

		System.out.println("Original StringBuffer: " + sb);

		System.out.println("Length of StringBuffer: " + eg.length(sb));
		System.out.println("Lowercase: " + eg.lowerCase(sb));
		System.out.println("Uppercase: " + eg.upperCase(sb));
		System.out.println("Substring: " + eg.substring(sb, 7, 14));
		System.out.println("Index of 'W': " + eg.indexOf(sb, 'W'));

		System.out.println("After Append: " + eg.append(sb, " Mayur "));

		System.out.println("After Insert: " + eg.insert(sb, 7, "Dear "));

		System.out.println("After Delete: " + eg.delete(sb, 7, 12));

		System.out.println("After Reverse: " + eg.reverse(sb));

		eg.reverse(sb); // Reverse again
		System.out.println("After Replace: " + eg.replace(sb, 7, 14, "Everyone"));

		System.out.println("After changes StringBuffer: " + sb);
		System.out.println("After changes the length of StringBuffer: " + eg.length(sb));

	}

}
