package view;

import java.util.Scanner;

public class Ex04ValidPassword {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Nhập password: ");
			String password = sc.nextLine();
			try {
				if(isValidPassword(password)) {
					System.out.println("Create account successfully!!!");
					break;
				}
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while(true);
		sc.close();
	}

	private static boolean isValidPassword(String password) {
		int length = password.length();
		if (length < 8) {
			throw new IllegalArgumentException("Mật khẩu phải có ít nhất 8 ký tự!");
		}
		if (!password.matches(".*([0-9]{1,}).*")) {
			throw new IllegalArgumentException("Mật khẩu phải có ít nhất là một số!");
		}
		if (!password.matches((".*([A-Z]{1,}).*"))) {
			throw new IllegalArgumentException("Mật khẩu phải có ít nhất 1 ký tự hoa!");
		}
		if (!password.matches(".*[!@#$%&*()_+=|<>?{}\\[\\]~-]{1,}.*")) {
			throw new IllegalArgumentException("At least one special characters");
		}
		return true;
	}
}
