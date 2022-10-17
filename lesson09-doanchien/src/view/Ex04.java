package view;

import java.util.Scanner;

public class Ex04 {
	private static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter your username: ");
		String username = sc.nextLine();
		System.out.println("Uesername is : " + username);
		do {
				try {
					System.out.print("Enter your password: ");
					String pass = sc.nextLine();
					boolean isValid = false;
					isValid = validate(pass);
					break;
				} catch (IllegalArgumentException e) {
					System.out.println(e.getMessage());
				}
		} while (true);
	}
	private static boolean validate(String pass) {
		int length = pass.length();
		
		if(!pass.matches("~!@#$%^&*()_=+[]{};:,.<>/?)")){
			throw new IllegalArgumentException("At least 1 special letter");
		}
		
		if(length < 8) {
			throw new IllegalArgumentException("At least 8 letter");
		}
		
		boolean atLeastOneUpperLetter = false;
		for (int i = 0; i < length ; i++) {
			if(Character.isUpperCase(pass.charAt(i))) {
				atLeastOneUpperLetter = true;
				break;
			}
		}
		
		if(!atLeastOneUpperLetter) {
			throw new IllegalArgumentException("At least one upper letter");
		}
		
		return true;
	}
}
