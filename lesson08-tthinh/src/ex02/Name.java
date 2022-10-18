package ex02;

import java.util.Scanner;

public class Name {

	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter name: ");
		String input = check();
		System.out.println("Name after format: " + format(input));
		
		ip.close();
	}

	private static String check() {
		Scanner ip = new Scanner(System.in);
		String input = ip.nextLine().trim();
		if (!input.matches("[a-zA-Z\\s]+")) {
			System.out.print("Enter wrong: ");
			return check();
		}
		return input;
	}

	private static String format(String s) {
		s = s.toLowerCase();
		String[] toWord = s.split("\\s+");
		String result = "";
		for (String word : toWord) {
			word = word.replaceFirst(word.charAt(0) + "", (word.charAt(0) + "").toUpperCase());
			result += word + " ";
		}
		return result.trim();
	}
	
}
