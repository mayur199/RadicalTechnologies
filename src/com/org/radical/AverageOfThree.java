package com.org.radical;

import java.util.Scanner;

public class AverageOfThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the first number: ");
		int n1 = sc.nextInt();

		System.out.print("Enter the second number: ");
		int n2 = sc.nextInt();
		System.out.print("Enter the third number: ");
		int n3 = sc.nextInt();

		int sum = n1 + n2 + n3;
		double average = sum / 3.0;

		System.out.println("Average : " + average);
	}

}
