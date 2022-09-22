package view;

import java.util.Scanner;

/*
 * Password requirements
 * 1. At least 8 characters
 * 2. At most 256 characters
 * 3. At least 1 lowercase character
 */
public class Ex04UserValidation {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean isPassed = false;
		System.out.print("Enter your password: ");
		String password = sc.nextLine();
		try {
			isPassed = validate(password);
		} catch (IllegalArgumentException e) {
//			e.printStackTrace();
			System.out.println(e.getMessage());
		}
		if (isPassed) {
			System.out.println("Created Successfully");
		}

		sc.close();
	}

	// throw new X
//	X: compile exception 
//		-> vtri khai báo hàm bắt buộc throws X
//	X: runtime exception 
//		-> vtri khai báo hàm ko cần throws X
	private static boolean validate(String password) {
		int length = password.length();
		if (length < 8) {
			throw new IllegalArgumentException("At least 8 characters");
//			System.out.println("At least 8 characters");
//			return false;
		}
		if (length > 256) {
			throw new IllegalArgumentException("At most 256 characters");
//			System.out.println("At most 256 characters");
//			return false;
		}
		boolean atLeastOneLowercaseLetter = false;
		for (char c : password.toCharArray()) {
			if (Character.isLowerCase(c)) {
				atLeastOneLowercaseLetter = true;
				break;
			}
		}
		if (!atLeastOneLowercaseLetter) {
			throw new IllegalArgumentException("At least 1 lowercase character");
//			System.out.println("At least 1 lowercase character");
		}
		return atLeastOneLowercaseLetter;
	}
}
