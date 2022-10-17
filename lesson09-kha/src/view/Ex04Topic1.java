package view;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

import exception.PasswordException;

public class Ex04Topic1 {
	public static void main(String[] args) {
		String username = "byztkhx256";
		System.out.println("USER NAME : " + username);
		String password = input(username);
		if(!password.equals("")) {
			System.out.println("Successfull");
			System.out.println("Your Account : ");
			System.out.println("USERNAME : " + username);
			System.out.println("PASSWORD : " + password);
		}
	}
	
	private static String input(String username) {
		String password = "";
		Scanner sc = new Scanner(System.in);
		do{
			System.out.print("Enter your Password : ");
			password = sc.nextLine();
			try {
				if(checkPassword(username, password)) {
					break;
				}
			}catch (PasswordException e) {
				System.out.println(e.getMessage());
			}
		}while(true);
		return password;
	}
	
	private static boolean checkPassword(String username, String password) {
		if(password.length()<8) throw new PasswordException("Password lenght must be great than 8");
		
		int wordscount = (int)password.chars().filter(o->Character.isLetter(o)).count();
		int numberscount = (int)password.chars().filter(o->Character.isDigit(o)).count();;
		int specialCharcount = password.length() - wordscount - numberscount;
		
		if(wordscount < 1 || numberscount < 1 || specialCharcount< 1 ) 
			throw new PasswordException("Password must be have 1 number, 1 letter, 1 special character");
		if(password.chars().filter(o -> username.indexOf(o) != -1).count() >=3)
			throw new PasswordException("Password can not match up to 3 character of username");
		return true;
	}
}
