package view;

import datastructure.Ex01Declare;

public class Ex01TestMainMethod {
	public static void main(String[] args) {
		System.out.println("Main method");
		anotherMainMethod();
		System.out.println("LargeNumber: " + Ex01Declare.largeNumber);
	}
	private static void anotherMainMethod() {
		System.out.println("Fake main method ");
	}
}
