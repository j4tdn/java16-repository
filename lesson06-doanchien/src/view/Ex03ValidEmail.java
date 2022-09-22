package view;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex03ValidEmail {
	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		do {
			try {
				System.out.print("Enter Your email: ");
				String Email = ip.nextLine();
				checked(Email);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}while(true);
	}
	
	private static void checked(String email) {
		String[] str = email.split("@");
		String rg = "^[a-zA-Z]+[a-zA-Z0-9]*@{1}\\\\w+mail.com$";
		Pattern pt = Pattern.compile(rg);
		if(str.length != 2) {
			throw new IllegalArgumentException("email must be @gmail.com");
			
		}
	}
	
}
