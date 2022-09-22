package view;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import exception.PassWordInvalidException;

public class Ex02 {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String password = "";
		do {
			System.out.print("Create a new password : ");
			password = ip.nextLine();
			try {
				if(checkPassword(password)) break;
			} catch (PassWordInvalidException e) {
				System.out.println(e.getMessage());
				System.out.println("Enter again !!!");
			}	
		}while(true);
		System.out.println("New password:" + password);
	}
	
	private static boolean checkPassword(String Password) {
		if(Password.length()<8) throw new PassWordInvalidException("At least 8 characters");
		if(Password.length()>256) throw new PassWordInvalidException("At most 256 characters");
		boolean isHaveLower = false;
		boolean isHaveUpper = false;
		boolean isHaveDigits = false;
		boolean isHaveSpecialChar = false;
		for (int i = 0; i < Password.length(); i++) {
			if(Character.isLowerCase(Password.charAt(i))) 
				isHaveLower = true;
			if(Character.isUpperCase(Password.charAt(i)))
				isHaveUpper = true;
			if(Character.isDigit(Password.charAt(i)))
				isHaveDigits = true;
		}
		if(!isHaveLower) throw new PassWordInvalidException("At least 1 lowercase alphabetic character (a, b, c...)");
		if(!isHaveUpper) throw new PassWordInvalidException("At least 1 uppercase alphabetic character (A, B, C...)");
		if(!isHaveDigits) throw new PassWordInvalidException("At least 1 number (1, 2, 3...)");
		Pattern special = Pattern.compile ("[!@#$%&*()_+=|<>?{}\\[\\]~-]");
		Matcher hasSpecial = special.matcher(Password);
		isHaveSpecialChar = hasSpecial.find();
		if(!isHaveSpecialChar) throw new PassWordInvalidException("At least 1 special character (~!@#$^&*()-_=+[]{}|;:,.<>/?)");
		
		return true;
	}
}
