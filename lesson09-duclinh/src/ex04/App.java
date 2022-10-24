package ex04;

import java.util.Scanner;
import java.util.regex.Pattern;

public class App {
	public static void main(String[] args) {
		// Password requirements
		// 1. At least 8 characters
		// 2. At most 256 characters
		Scanner ip = new Scanner(System.in);
		
		System.out.println("Input UserName");
		String userName = ip.nextLine();
		
				
		
		System.out.println("Input password");
		String password = ip.nextLine();
		
		boolean isPassed = false;
		
		try {
		
			isPassed = validate(password);
			isPassed = validateAccount(userName,password);
		
		}catch(IllegalArgumentException e){
		
			System.out.println(e.getMessage());
		}		
		if(isPassed) {
			System.out.println("Create account successful");
		}
		
		System.out.println("Finished ...");
		ip.close();
	}
	private static void printf(String[] tokens) {
		for (String token: tokens) {
			System.out.println("||" + token + "||");
		}
	}
	private static boolean validateAccount(String userName, String password) {
		int count = 0;
		for (char i = 'a'; i <= 'z'; i++ ) {
			if (userName.contains(Character.toString(i)) == password.contains(Character.toString(i))) {
				count++;
				if (count == 3) {
					throw new IllegalArgumentException("Account and password more than 3 same letter is invalid!!");
				}
				else {
					return true;
				}
				
			}
		}
		return true;
	}
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
		boolean atLeastOneLowerLetter = false;
		for(int i = 0; i < length; i++) {
			if (Character.isLowerCase(password.charAt(i)) ) {
				atLeastOneLowerLetter = true;
				break;
			}
		}

		Pattern pSpecialChar = Pattern.compile("[^A-Za-z0-9]");
		if (!pSpecialChar.matcher(password).find()) {
			throw new IllegalArgumentException("At least 1 special character.");
		}
		Pattern Uppercase  = Pattern.compile("[^A-Z]");
		if (Uppercase.matcher(password).find()) {
			throw new IllegalArgumentException("At least 1 Uppercase character.");
		}
		if (!atLeastOneLowerLetter) {
			throw new IllegalArgumentException("At least one lower letter");
			// System.out.println("At least one lower letter");
		}
		return atLeastOneLowerLetter;
	}
	

}
