package ex01;

import java.util.Scanner;

public class Text {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.println("Enter text: ");
		String text = ip.nextLine();

		for (int i = 0; i < text.length(); i++) {
			System.out.println(text.charAt(i) + " ");
		}
		System.out.println("===================================");

		String[] elements = text.split(" ");
		for (String element : elements) {
			System.out.println(element);
		}
		System.out.println("==================================");

		for (int i = text.length() - 1; i >= 0; i--) {
			System.out.println(text.charAt(i));
		}
		System.out.println("==================================");
		for (int i = elements.length - 1; i >= 0; i--) {
			System.out.println(elements[i]);
		}
		
		ip.close();
	}

}
