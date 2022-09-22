package view;

import java.util.Scanner;

public class Ex02Password {
	public static void main(String[] args) throws Exception {
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter your password: ");
		String password = sr.nextLine();
		boolean isPassed = false;
		try {
			isPassed = validate(password);
		} catch (IllegalArgumentException e) {
			e.printStackTrace();
		}
		if (validate(password)) {
			System.out.println("Create account successful");
		}
		System.out.println("Finish !!!");
		sr.close();
	}
	
	private static boolean validate(String password) throws Exception {
		int length = password.length();
		if (length < 8) {
			throw new IllegalArgumentException("At least 8 characters");
		}
		if (length > 256) {
			throw new IllegalArgumentException("At most 256 characters");
		}
		
		boolean atLeastOneLower = false;
		for (int i = 0; i < length; i++) {
			if (Character.isLowerCase(password.charAt(i))) {
				atLeastOneLower = true;
				break;
			}
		}
		if (!atLeastOneLower) {
			throw new IllegalArgumentException("At least 1 lowecrcase alphabetic");
		}
		
		boolean atLeastOneUpper = false;
		for (int i = 0; i < length; i++) {
			if (Character.isUpperCase(password.charAt(i))) {
				atLeastOneUpper = true;
				break;
			}
		}
		if (!atLeastOneUpper) {
			throw new IllegalArgumentException("At least 1 Uppercase alphabetic");
		}
		
		
		if (!password.matches(".*\\d.*")) {
			throw new IllegalArgumentException("At least 1 number");
		}
		
		if (!password.matches(".*[*.!@#$%^&(){}[]:\";'<>,.?/~`_+-=|\\\\].*")) {
			throw new IllegalArgumentException("At least special character");
		}
		return true;
	}

}
