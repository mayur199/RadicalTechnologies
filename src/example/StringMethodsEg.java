package example;

public class StringMethodsEg {

	public int length(String s) {
		int i = 0;
		while (true) {
			try {
				s.charAt(i);
				i++;
			} catch (StringIndexOutOfBoundsException e) {
				break;
			}
		}
		return i;

	}

	public String lowerCase(String s) {
		String result = "";
		int i = 0;

		while (true) {
			try {
				char c = s.charAt(i);
				// Check if the character is uppercase
				if (c >= 'A' && c <= 'Z') {
					// Convert to lowercase by adding 32 to ASCII value
					c = (char) (c + 32);
				}
				result += c;
				i++;
			} catch (StringIndexOutOfBoundsException e) {
				break;
			}
		}

		return result;
	}

	public String upperCase(String s) {
		String result = "";
		int i = 0;
		while (true) {
			try {
				char c = s.charAt(i);
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

	public String substring(String s, int start, int end) {
		String result = "";
		for (int i = start; i < end; i++) {
			result += s.charAt(i);
		}
		return result;
	}

	public int indexOf(String s, char ch) {
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ch) {
                return i; // return index if character matches
            }
        }
        return -1; // return -1 if character is not found
    }
	
	public static void main(String[] args) {
		StringMethodsEg eg = new StringMethodsEg();

		String st = "Hello, Welcome to India";
		int length = eg.length(st);

		System.out.println("Length of string: " + length);
//		String str= eg.lowerCase(st);
//		System.out.println("Lowercase: " + eg.lowerCase(st));
		System.out.println("Uppercase: " + eg.upperCase(st));
        System.out.println("Substring: " + eg.substring(st, 8, 14));
        System.out.println("Index of 'W': " + eg.indexOf(st, 'W'));


	}
}
