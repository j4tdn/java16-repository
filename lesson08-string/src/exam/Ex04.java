package exam;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex04 {


	public static void main(String[] args) {

		Scanner ip = new Scanner(System.in);
		System.out.println("enter email");
		String account =ip.nextLine();
		System.out.println("enter password: ");
		String password = ip.nextLine();
		boolean isPassed = false;
		try {
			isPassed = validate(password);
			isPassed = validateAccount(account, password);
		} catch (IllegalArgumentException e) {

			System.out.println(e.getMessage());
		}
		if (isPassed) {
			System.out.println("Create account successful");
		}

		System.out.println("finish ...");
		ip.close();
	}
	private static boolean validateAccount(String account, String password) {
		int count = 0;
		for (char i = 'a'; i <= 'z'; i++ ) {
			if (account.contains(Character.toString(i)) == password.contains(Character.toString(i ))) {
				count++;
				if (count == 3)
					throw new IllegalArgumentException("Account and password more than 3 same letter is invalid!!");
			}
		}
		return true;
	}
	

	private static boolean validate(String password) {
		int length = password.length();
		if (length < 8) {
			throw new IllegalArgumentException("at least 8 character");

		}
		
		

		boolean isHaveDigits = false;

		for (int i = 0; i < length; i++) {
			
			if (Character.isDigit(password.charAt(i))) {
				isHaveDigits = true;

			}
		}
		
		if (!isHaveDigits) {
			throw new IllegalArgumentException("At least one number 1,2,3");

		}
		Pattern pSpecialChar = Pattern.compile("[^A-Za-z0-9]");
		if (!pSpecialChar.matcher(password).find()) {
			throw new RuntimeException("At least 1 special character.");
		}
		Pattern Uppercase  = Pattern.compile("[^A-Z]");
		if (Uppercase.matcher(password).find()) {
			throw new RuntimeException("At least 1 Uppercase character.");
		}
		return isHaveDigits;
	}

}