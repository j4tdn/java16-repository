import java.util.Scanner;

public class Ex02PasswordRequiments {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter password: ");
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
		System.out.println("Finished ... ");
		ip.close();
	}

	private static boolean validate(String password) {
		int length = password.length();

		if (length < 8) {
			throw new IllegalArgumentException("At least 8 characters");
		}

		if (length > 256) {
			throw new IllegalArgumentException("At most 256 characters");
		}

		boolean atLeastOneLowerLetter = false;
		for (int i = 0; i < length; i++) {
			if (Character.isLowerCase(password.charAt(i))) {
				atLeastOneLowerLetter = true;
				break;
			}
		}
		if (!atLeastOneLowerLetter) {
			throw new IllegalArgumentException("At least one lower characters");
		}

		boolean atLeastOneUpperLetter = false;
		for (int i = 0; i < length; i++) {
			if (Character.isUpperCase(password.charAt(i))) {
				atLeastOneUpperLetter = true;
				break;
			}
		}
		if (!atLeastOneUpperLetter) {
			throw new IllegalArgumentException("At least one upper characters");
		}

		boolean atLeastOneNumberLetter = false;
		for (int i = 0; i < length; i++) {
			if (Character.isDigit(password.charAt(i))) {
				atLeastOneNumberLetter = true;
				break;
			}
		}
		if (!atLeastOneNumberLetter) {
			throw new IllegalArgumentException("At least one number characters");
		}

		boolean atLeastOneSpecialLetter = false;
		for (int i = 0; i < length; i++) {
			if (password.matches(".*[$&+,:;=\\\\\\\\?@#|/'<>.^*()%!-].*")) {
				atLeastOneSpecialLetter = true;
				break;
			}
		}
		if (!atLeastOneSpecialLetter) {
			throw new IllegalArgumentException("At least one special characters");
		}
		return atLeastOneLowerLetter;
	}
}