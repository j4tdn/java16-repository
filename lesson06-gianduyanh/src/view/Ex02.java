package view;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

public class Ex02 {
	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {

		do {

			try {
				System.out.println("Enter password ");
				String pw = ip.nextLine();
				boolean isPassed = false;
				isPassed = validate(pw);
				break;
			} catch (IllegalArgumentException e) {
				
				System.out.println(e.getMessage());
			}
		} while (true);
		System.out.println("Finished");

	}

	private static boolean validate(String pw) {
		int lengt = pw.length();

		if (!pw.matches(".*[$&+,:;=\\\\\\\\?@#|/'<>.^*()%!-].*")) {
			throw new IllegalArgumentException("chua co ki tu nao");
		}



		if (lengt < 8) {
			// System.out.println("duoi 8 ki tu");
			// return false;
			throw new IllegalArgumentException("duoi 8 ki tu");
		}
		if (lengt > 256) {
			// System.out.println("tren 256 ki tu");
			// return false;
			throw new IllegalArgumentException("tren 256 ki tu");
		}
		boolean k = false;
		for (int i = 0; i < lengt; i++) {
			if (Character.isLowerCase(pw.charAt(i))) {
				k = true;
				break;
			}

		}
		boolean v = false;
		for (int i = 0; i < lengt; i++) {
			if (Character.isUpperCase(pw.charAt(i))) {
				v = true;
				break;
			}

		}
		if (!v) {
			// System.out.println("at least one lower letter");
			throw new IllegalArgumentException("at least one upper letter");
		}

		if (!k) {
			// System.out.println("at least one lower letter");
			throw new IllegalArgumentException("at least one lower letter");
		}
		boolean b = false;
		for (int i = 0; i < lengt; i++) {
			if (Character.isDigit(pw.charAt(i))) {
				b = true;
				break;
			}
		}
		if (!b) {
			// System.out.println("at least one lower letter");
			throw new IllegalArgumentException("chua co so");
		}

		return k;
	}
}
