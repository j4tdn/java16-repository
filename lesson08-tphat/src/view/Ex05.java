package view;

import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String text1, text2;
		System.out.println("Nhập chuỗi thứ nhất: ");
		text1 = ip.nextLine();
		System.out.println("Nhập chuỗi thứ hai: ");
		text2 = ip.nextLine();
		System.out.println(commonString(text1, text2));
	}

	private static String commonString(String a, String b) {
		String string = "";
		for (int i = 0; i < a.length(); i++) {
			for (int j = i; j < a.length(); j++) {
				if (b.contains(a.substring(i, j + 1))) {
					if (string.length() < a.substring(i, j + 1).length())
						string = a.substring(i, j + 1);
				}
			}
		}
		return string;
	}
}
