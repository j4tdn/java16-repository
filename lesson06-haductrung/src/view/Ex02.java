package view;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex02 {


	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.println("enter password: ");
		String password = ip.nextLine();
		boolean isPassed = false;
		try {
			isPassed = validate(password);
		} catch (IllegalArgumentException e) {

			System.out.println(e.getMessage());
		}
		if (isPassed) {
			System.out.println("Create account successful");
		}

		System.out.println("finish ...");
		ip.close();
	}

	private static boolean validate(String password) {
		int length = password.length();
		if (length < 8) {
			throw new IllegalArgumentException("at least 8 character");

		}
		if (length > 256) {
			throw new IllegalArgumentException("at most 256 character");

		}

		boolean atLeastOneLowerLetter = false;

		boolean isHaveUpper = false;
		boolean isHaveDigits = false;

		for (int i = 0; i < length; i++) {
			if (Character.isLowerCase(password.charAt(i))) {
				atLeastOneLowerLetter = true;

			}
			if (Character.isUpperCase(password.charAt(i))) {
				isHaveUpper = true;

			}
			if (Character.isDigit(password.charAt(i))) {
				isHaveDigits = true;

			}
		}
		if (!atLeastOneLowerLetter) {
			throw new IllegalArgumentException("At least one lower letter");

		}
		if (!isHaveUpper) {
			throw new IllegalArgumentException("At least one upper letter");

		}
		if (!isHaveDigits) {
			throw new IllegalArgumentException("At least one number 1,2,3");

		}
		Pattern pSpecialChar = Pattern.compile("[^A-Za-z0-9]");
		if (!pSpecialChar.matcher(password).find()) {
			throw new RuntimeException("At least 1 special character.");
		}
		return atLeastOneLowerLetter;
	}

}
