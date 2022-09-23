package view;

import java.util.Scanner;

public class Ex03Email {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		boolean check = true;
		do {
			try {
				System.out.println("Type your email: ");
				String email = ip.next();

				String[] parts = email.split("@");
				check = checkPostfix(parts[0]) && checkDomain(parts[1]);

				if (check)
					break;

			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
	ip.close();
	}

	static boolean checkDomain(String valid) {

		if (!valid.matches(".*[!@#$%&*()_+=|<>?{}\\[\\]~-]{1,}.*")) {
			throw new IllegalArgumentException("Invalid emaiil");
		}
		return true;
	}

	static boolean checkPostfix(String valid) {
		if (!valid.matches(".*[!@#$%&*()_+=|<>?{}\\[\\]~-]{1,}.*")) {
			throw new IllegalArgumentException("Invalid emaiil");
		}
		return true;

	}

}
