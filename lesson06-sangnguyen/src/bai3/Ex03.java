package bai3;

import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
			Scanner ip = new Scanner(System.in);
			System.out.println("Enter email: ");
			String email = ip.nextLine();
		
			boolean isPass = false;
			try {
				isPass = isValidEmail(email);
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
			
			if(isPass) {
				System.out.println("Create account successful");
			}
			ip.close();
		}
		public static boolean isValidEmail(String email) {
			boolean firstCharacter = true;
			boolean twoConsecutiveSpectialCharacters = true;
			
			// first character
			if (!Character.isLetterOrDigit(email.charAt(0))) {
				firstCharacter = false;
			}
			// two consecutive special characters
			for (int i = 0; i < email.length(); i++) {
				if (!Character.isLetterOrDigit(email.charAt(i)) && 
					(!Character.isLetterOrDigit(email.charAt(i+1)))) {
					twoConsecutiveSpectialCharacters = false;
				}
			}
			
			if (!firstCharacter) {
				throw new IllegalArgumentException(" firsr character is letter or number !");
			}
			if (!twoConsecutiveSpectialCharacters) {
				throw new IllegalArgumentException(" two consecutive special characters !");
			}
			return firstCharacter;
		}
}
