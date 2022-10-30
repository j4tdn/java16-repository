package views;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Ex02 {
	
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		String regex = "[a-zA-Z\\s]+";
		String yourName;
		
		System.out.print("Enter name: ");
		yourName = sc.nextLine();
		
		while (!Pattern.matches(regex, yourName)) {
			System.out.print("Enter name: ");
			yourName = sc.nextLine();	
		}
		
		String str = yourName.toLowerCase();
		
		String[] names = str.split("\\s");
		String result = "";
	
		for (String name : names) {
			String s = name.substring(0, 1).toUpperCase() + name.substring(1);
			result += s + " ";
		}
		
		result.trim();
		System.out.println(result);
	}
}
