package view;

import java.util.Scanner;

public class Ex02Password {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		do {
			System.out.println("Enter your password: ");
			String password = ip.nextLine();
			
			try {
				if (validate(password)) {
					System.out.println("Your account has been created successfully !!!");
					break;
				}
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}while(true);
		
		ip.close();
		
	}

	private static boolean validate(String password) {
		if(password.length() < 8) {
			throw new IllegalArgumentException("At least 8 character");
		}
		if(password.length() > 256) {
			throw new IllegalArgumentException("At most 256 character");
		}
		
		boolean lowerLetter = false;
		for(int i = 0; i < password.length(); i++) {
			if(Character.isLowerCase(password.charAt(i))) {
				lowerLetter = true;
				break;
			}
		}
		
		if(lowerLetter == false) {
			throw new IllegalArgumentException("At least one lower case alphabetic character");
		}
		
		
		boolean upperLetter = false;
		for(int i = 0; i < password.length(); i++) {
			if(Character.isUpperCase(password.charAt(i))) {
				upperLetter = true;
				break;
			}
		}
		
		if(upperLetter==false) {
			throw new IllegalArgumentException("At least one upper case alphabetic character");
		}
		
		if (!password.matches(".*([0-9]{1,}).*")) {
			throw new IllegalArgumentException("At least one number");
		}
		if (!password.matches(".*[!@#$%&*()_+=|<>?{}\\[\\]~-]{1,}.*")) {
			throw new IllegalArgumentException("At least one special characters");
		}
			
		return true;
		
		
		
		
		
		
	
	}
}
