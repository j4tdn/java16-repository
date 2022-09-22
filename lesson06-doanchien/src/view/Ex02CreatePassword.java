package view;

import java.util.Scanner;

public class Ex02CreatePassword {
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		do {
			try {
				System.out.print("Enter your password: ");
				String pass = ip.nextLine();
				boolean isValid = false;
				isValid = validate(pass);
				break;
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		} while(true);
	}
	private static boolean validate(String pass) {
		int length = pass.length();
		
		if(!pass.matches("~!@#$%^&*()_=+[]{};:,.<>/?)")){
			throw new IllegalArgumentException("At least 1 special letter");
		}
		
		if(length < 8) {
			//System.out.println("At least 8 letter");
			throw new IllegalArgumentException("At least 8 letter");
		}
		
		if(length > 256) {
			throw new IllegalArgumentException("At most 256 letter");
		}
		boolean atLeastOneLowerLetter = false;
		for (int i = 0; i < length ; i++) {
			if(Character.isLowerCase(pass.charAt(i))) {
				atLeastOneLowerLetter = true;
				break;
			}
		}
		boolean atLeastOneUpperLetter = false;
		for (int i = 0; i < length ; i++) {
			if(Character.isUpperCase(pass.charAt(i))) {
				atLeastOneUpperLetter = true;
				break;
			}
		}
		if(!atLeastOneLowerLetter) {
			throw new IllegalArgumentException("At least one lower letter");
		}
		
		if(!atLeastOneUpperLetter) {
			throw new IllegalArgumentException("At least one upper letter");
		}
		boolean isDigit = false;
		for(int i = 0; i <length; i++) {
			if(Character.isDigit(pass.charAt(i))) {
				isDigit = true;
				break;
			}
		}
		if(!isDigit) {
			throw new IllegalArgumentException("At least one digit");
		}
		return true;
	}
	
}

