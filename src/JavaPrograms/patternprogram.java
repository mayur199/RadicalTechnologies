package JavaPrograms;

public class patternprogram {
	public static void main(String[] args) {
//		System.out.println("1\n"
//				+ "12\n"
//				+ "123\n"
//				+ "1234\n"
//				+ "12345\n"
//				+ "123456\n");

		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("1");
			}
			System.out.println();
		}
	}
}
