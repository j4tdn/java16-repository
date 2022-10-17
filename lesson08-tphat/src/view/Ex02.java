package view;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String text = "";
		System.out.println("Nhập họ tên: ");
		text = ip.nextLine();
		try {
			inputValue(text);
			ulC(text);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static boolean inputValue(String text) throws Exception {
		if (!Pattern.matches("[a-zA-Z\\s]+", text)) {
			throw new Exception("Họ tên chỉ bao gồm các kí tự [a-zA-Z ]");
		}
		return true;
	}

	private static void ulC(String text) {
		String result = "";
		for (String word : text.split("[\\s]+")) {
			result += word.substring(0, 1).toUpperCase() + word.substring(1).toLowerCase() + " ";
		}

		System.out.println(result);
	}

}
