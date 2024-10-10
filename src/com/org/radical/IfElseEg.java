package com.org.radical;

import java.util.Scanner;

public class IfElseEg {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Person Age: ");
		int age = sc.nextInt();
		if (age >= 18) {
			System.out.println("adult");
		} else {
			System.out.println("Not adult");
		}
	}

}
