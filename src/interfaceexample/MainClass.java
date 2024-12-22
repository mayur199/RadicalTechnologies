package interfaceexample;

import java.util.Scanner;

public class MainClass {
	public static void main(String[] args) {

		System.out.println("press 1 for car");
		System.out.println("press 2 for bike");

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Vehicle v = selectVehicle(n);

		v.start();
	}

	private static Vehicle selectVehicle(int num) {

		if (num == 1) {
			return new Car();
		} else {
			return new Bike();
		}

	}

}
