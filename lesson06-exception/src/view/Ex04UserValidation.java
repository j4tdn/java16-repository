package view;

import java.util.Scanner;

public class Ex04UserValidation {
	public static void main(String[] args) {
		// PasswordRequirements
		// At least 8 characters
		// At most 256 characters
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter Password: ");
		String password = ip.nextLine();
		boolean isPass = false;
		try {
			isPass = validate(password);
		} catch (IllegalArgumentException e) {
			//e.printStackTrace();
			System.out.println(e.getMessage());
		}

		if (isPass) {
			System.out.println("Create account successfully !");
		}
		System.out.println("Finish");
		ip.close();
	}

	// throw new X
	// X: compile exception
	// --> Vị trí khai báo hàm bắt buộc throws X
	// X: runtime exception
	// --> Vị trí khai báo hàm: không cần throws X
	private static boolean validate(String password) {
		int length = password.length();
		if (length < 8) {
			throw new IllegalArgumentException("At least 8 characters");
			// System.out.println("At least 8 characters");
			// return false;
		}
		if (length > 256) {
			throw new IllegalArgumentException("At most 256 characters");
			// System.out.println("At most 256 characters");
			// return false;
		}
		// at least one lower character
		boolean atLeatOneLowerLetter = false;
		for (int i = 0; i < password.length(); i++) {
			if (Character.isLowerCase(password.charAt(i))) {
				atLeatOneLowerLetter = true;
				break;
			}
		}
		if (!atLeatOneLowerLetter) {
			throw new IllegalArgumentException("At least one lower characters");
			// System.out.println("At least one lower characters");
		}
		return atLeatOneLowerLetter;
	}
}
