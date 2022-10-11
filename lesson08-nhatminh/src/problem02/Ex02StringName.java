package problem02;

import java.util.Scanner;

public class Ex02StringName {
	public static void main(String[] args) {
		String name = getName();
		System.out.println("Right format: " + getRightFormatName(name));
	}

	private static String getName() {
		String result = "";
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.print("Input name(can be Vietnamese): ");
			result = sc.nextLine();
			if (result.matches(".*[^\\p{L}\\s].*"))
				System.out.println("Words(can be Vietnamese) and space only!");
			else
				break;
		}
		return result;
	}

	private static String getRightFormatName(String name) {
		String result = "";
		String[] strList = name.trim().toLowerCase().split("\\s+");
		for (String string : strList) {
			string = string.substring(0, 1).toUpperCase() + string.substring(1);
			result += " " + string;
		}
		return result.trim();
	}
}
