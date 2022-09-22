package exercises;

import java.util.Scanner;

public class Ex02RegisterAnAccount {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.print("Enter User name: ");
		String username = ip.nextLine();
		boolean ispassword = false;
		do {
			System.out.print("Enter Password : ");
			String password = ip.nextLine();
			try {
				ispassword = validated(password);
				break;
			} catch (IllegalArgumentException e) {
				// TODO: handle exception
				System.out.println("error --> " + e.getMessage());
			}
		} while (true);
		if (ispassword) {
			System.out.println("Create account successful");
		}

		System.out.println("Finished...");

	}

	private static boolean validated(String password) {
		// At least 8 characters
		if (password.length() < 8) {
			throw new IllegalArgumentException("At least 8 characters");
		}
		// At most 256 characters
		if (password.length() > 256) {
			throw new IllegalArgumentException("At most 256  characters");
		}
		// At least one lower letter
		boolean atleastOneLowerLetter = false;
		for (int i = 0; i < password.length(); i++) {
			if (Character.isLowerCase(password.charAt(i))) {
				atleastOneLowerLetter = true;
				break;
			}
		}
		if (!atleastOneLowerLetter) {
			throw new IllegalArgumentException("At least one lower letter");
		}
		// At least one upper letter
		boolean atleastOneUpperLetter = false;
		for (int i = 0; i < password.length(); i++) {
			if (Character.isUpperCase(password.charAt(i))) {
				atleastOneUpperLetter = true;
				break;
			}
		}
		if (!atleastOneUpperLetter) {
			throw new IllegalArgumentException("At least one upper letter");
		}
		// At least one number
		if (!password.matches(".*\\d.*")) {
			throw new IllegalArgumentException("At least one number");
		}
		// At least one special character
		if (!password.matches(".*[$&+,:;=\\\\\\\\?@#|/'<>.^*()%!-].*")) {
			throw new IllegalArgumentException("At least 1 special character");
		}

		return atleastOneLowerLetter;
	}
}
