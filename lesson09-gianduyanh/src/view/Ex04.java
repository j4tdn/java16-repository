package view;

import java.util.Arrays;
import java.util.Iterator;

public class Ex04 {
	public static void main(String[] args) {
		String user = "duyanh26";
		String pw = "Bitxyz78@";

		try {

			registerAccout(user, pw);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void registerAccout(String user, String pw) {
		int number = (int) pw.chars().filter(o -> Character.isDigit(o)).count();
		int uppercase = (int) pw.chars().filter(o -> Character.isUpperCase(o)).count();
		int lowercase = (int) pw.chars().filter(o -> Character.isLowerCase(o)).count();
		int specialcharacter = pw.length() - number - uppercase - lowercase;
		int lengthPW = pw.length();
		if (lengthPW < 8) {
			throw new IllegalArgumentException("Password is less than 8");
		}
		if (number < 1) {
			throw new IllegalArgumentException("Need at least 1 digit");
		}
		if (uppercase < 1) {
			throw new IllegalArgumentException("Need at least 1 UpperCase Character");
		}
		if (lowercase < 1) {
			throw new IllegalArgumentException("Need at least 1 Character");
		}
		if (specialcharacter < 1) {
			throw new IllegalArgumentException("Need at least 1 Special Character");
		}
		listDataEqual(user, pw);

		System.out.println("Success !!!");
	}

	private static void listDataEqual(String user, String pw) {
		String[] a = user.split("");
		String[] b = pw.split("");
		int count = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < b.length; j++) {
				if (a[i].equals(b[j])) {
					count++;
					System.out.println(count);
				}
				if (count > 3) {
					throw new IllegalArgumentException("Cannot duplicate more than 3 characters with account name");
				}
			}

		}
		System.out.println(count);

	}

}
