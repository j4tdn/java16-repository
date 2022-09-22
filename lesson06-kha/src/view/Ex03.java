package view;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex03 {
	public static void main(String[] args) {
		String listMail[] = {"abc-@mail.com", "abc..def@gmail.com", ".abc@mail.com", "abc#def@mail.com", "abc-d@mail.com", "abc.def@mail.com", "abc@mail.com", "abc_def@mail.com"};
		for (String mail : listMail) {
			System.out.println(checkValidMail(mail) ? "Valid " + mail : "Invalid " + mail);
		}
		Scanner ip = new Scanner(System.in);
		String mail = "";
		do {
			System.out.print("Enter your mail : ");
			mail = ip.nextLine();
			if(checkValidMail(mail)) break;
			System.out.println("Mail is Invalid!!!");
		} while (true);
		
		System.out.println("Your mail: " + mail);
		
	}
	
	private static boolean checkValidMail(String mail) {
		String prefix = "";
		String domain = "";
		int count = 0;
		for (int i = 0; i < mail.length(); i++) {
			if(mail.charAt(i) == '@') count++;
		}
		if(count>1) return false;
		prefix = mail.split("@")[0];
		
		if(!Character.isLetter(prefix.charAt(0)) || !Character.isLetter(prefix.charAt(prefix.length()-1)))return false;
		//domain = mail.split("@")[1];
		Pattern PatterPrefix = Pattern.compile ("^[A-Za-z0-9]+([\\.\\-\\_][A-Za-z0-9]+){0,}$");
		Matcher MatcherPrefix = PatterPrefix.matcher(prefix);
		if(!MatcherPrefix.find()) return false;
		
		return true;
	}
}
