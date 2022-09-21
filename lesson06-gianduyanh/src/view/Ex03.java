package view;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex03 {
	private static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		do {
			try {
				System.out.println("Enter email : ");
				String email = sc.nextLine();
				checkMail(email);
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		} while (true);
		System.out.println("finish ..");
	}

	private static void checkMail(String text) {
		String[] da = text.split("@");
		String regax = "^[a-zA-Z]+[a-zA-Z0-9]*@{1}\\w+mail.com$";
		Pattern pattern = Pattern.compile(regax);
		Matcher matcher = pattern.matcher(text);
		if (da.length != 2) {
			throw new IllegalArgumentException("mail phai co @gmail.com");
		}
		String email = da[0];
		if (!matcher.find()) {
			throw new IllegalArgumentException("khong dung dinh dang Example@gmail.com");
		}

	}

}
