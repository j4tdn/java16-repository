package bai2;

import java.util.Scanner;

public class Ex02 {
		public static void main(String[] args) {
			
			Scanner ip = new Scanner(System.in);
			System.out.println("Enter password: ");
			String password = ip.nextLine();
		
			boolean isPass = false;
			try {
				isPass = validate(password);
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			
			if(isPass) {
				System.out.println("Create account successful");
			}
			ip.close();
		}
		
		public static boolean validate(String password) {
			int length = password.length();
			if (length < 8) {
				throw new IllegalArgumentException("At least 8 character");
			}
			if (length > 256) {
				throw new IllegalArgumentException("At most 256 character");
			}
			
			// ai least one lower letter 
			boolean atLeastOneLowerLetter = false;
			boolean atLeastOneUpperLetter = false;
			boolean atLeastOneNumber = false;
			boolean atLeastOneSpecialcharacter = false;
			for (int i = 0; i < length; i++) {
				if ( Character.isLowerCase(password.charAt(i))) {
					atLeastOneLowerLetter = true;
				}
				if ( Character.isUpperCase(password.charAt(i))) {
					atLeastOneUpperLetter = true;
				}
				if ( Character.isDigit(password.charAt(i))) {
					atLeastOneNumber = true;
				}
				
				if (! Character.isLetterOrDigit(password.charAt(i))) {
					atLeastOneSpecialcharacter = true;
				}
			}
			if (!atLeastOneLowerLetter) {
				throw new IllegalArgumentException("At least one lower letter");
			}
			if (!atLeastOneUpperLetter) {
				throw new IllegalArgumentException("At least one upper letter");
			}
			if (!atLeastOneNumber) {
				throw new IllegalArgumentException("At least one number");
			}
			if (!atLeastOneSpecialcharacter) {
				throw new IllegalArgumentException("At least one special character");
			}
			return atLeastOneLowerLetter & atLeastOneUpperLetter & atLeastOneNumber & atLeastOneSpecialcharacter;
	}
}
