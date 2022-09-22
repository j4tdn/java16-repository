package view;

import java.util.Scanner;

public class Ex02PassWordValidation {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		boolean isPass = false;
		do {
			System.out.println("Enter password: ");
			String password = ip.nextLine();
			
			try {
				isPass = validate(password);
			} catch (IllegalArgumentException e) {
				System.out.println(e.getMessage());
			}
		}while(!isPass);
		
		if (isPass) {
			System.out.println("Create acount successful");
		}
		System.out.println("Finish!!");
		ip.close();
		
		
	}

	private static boolean validate(String password) {
		int len = password.length();
		if(len < 8) {
			throw new IllegalArgumentException("At least 8 character!!");
		}
		if(len > 256) {
			throw new IllegalArgumentException("At most 256 character!!");
		}
		
		boolean atLeastOneLowerLetter = false;
		for(int i = 0; i < len; i++) {
			if(Character.isLowerCase(password.charAt(i))) {
				atLeastOneLowerLetter = true;
				break;
			}
		}
		
		if(!atLeastOneLowerLetter) {
			throw new IllegalArgumentException("At least one lower letter!!");
		}
		
		
		boolean atLeastOneUpperLetter = false;
		for(int i = 0; i < len; i++) {
			if(Character.isUpperCase(password.charAt(i))) {
				atLeastOneUpperLetter = true;
				break;
			}
		}
		
		if(!atLeastOneUpperLetter) {
			throw new IllegalArgumentException("At least one upper letter!!");
		}
		
//		boolean atLeastOneNumber = false;
//		for(int i = 0; i < len; i++) {
//			if(password.charAt(i) > '0' && password.charAt(i) < '9') {
//				atLeastOneNumber = true;
//				break;
//			}
//		}
//		
//		
//		if(!atLeastOneNumber) {
//			throw new IllegalArgumentException("At least one number!!");
//		}
//		
		int count =0;
		for(char i = '0'; i <= '9'; i++) {
			if(password.contains(Character.toString(i))) {
				count++;
				if(count == 1) break;
			}
		}
		
		if(count == 0) {
			throw new IllegalArgumentException("At least one 1 number!!");
		}
		
		count = 0;
		String[] specialCharacter= {"(","!","@","#","%","^","&","*","(",")","-","_","=","[","]","{","}","|",";",":",",",".","<",">","/","?"};
		for(int i = 0; i < specialCharacter.length; i++) {
			if(password.contains(specialCharacter[i])) {
				count++;
				if(count == 1) break;
			}
		}
		
		if(count == 0) {
			throw new IllegalArgumentException("At least one 1 special character!!");
		}
		

		
		return true;
		
		
		
		
		
		
	
	}
}
