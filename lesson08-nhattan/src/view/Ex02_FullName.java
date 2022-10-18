package view;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex02_FullName {
	public static void main(String[] args) {
		Pattern firstLetter = Pattern.compile("^[A-Za-z]+");
		Pattern lastLetter = Pattern.compile("[A-Za-z]+$");
		Pattern space = Pattern.compile("[A-Za-z]\\s[A-Za-z]");
		Scanner ip = new Scanner(System.in);
		do {
			System.out.print("Nhap ho ten: ");
			String fullName = ip.nextLine();
			if (firstLetter.matcher(fullName).find() && lastLetter.matcher(fullName).find()
					&& space.matcher(fullName).find()) {

				System.out.println(upperLetterOfWords(fullName));
				ip.close();
				break;
			}
		} while (true);

	}

	private static String upperLetterOfWords(String sentence) {
		sentence = sentence.trim();
		sentence = sentence.toLowerCase();

		StringBuilder sB = new StringBuilder(sentence);

		sB.setCharAt(0, Character.toUpperCase(sB.charAt(0)));
		for (int i = 1; i < sentence.length() - 1; i++) {
			if (Character.isSpaceChar(sB.charAt(i))) {
				i++;
				sB.setCharAt(i, Character.toUpperCase(sB.charAt(i)));
			}
		}
		return sB.toString();
	}
}
