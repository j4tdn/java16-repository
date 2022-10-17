package view;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Ex02 {
	static String RegexPattern = "[A-Za-z\\s]+";
	
	public static void main(String[] args) {
//		String firstName = Input("First name");
//		String lastName = Input("Last name");
		String firstName = "pHam tUAN";
		String lastName = "kha";
		printFullName(firstName, lastName);
	}
	
	private static String Input(String s) {
		Scanner sc = new Scanner(System.in);
		String tmp = "";
		while(true) {
			System.out.print("Enter " + s + " : ");
			tmp = sc.nextLine();
			if(tmp.matches(RegexPattern))
				return tmp;
		}
	}

	private static void printFullName(String firstName, String lastName) {
		firstName = firstName.toLowerCase();
		lastName = lastName.toLowerCase();
		String fullName = firstName + " " + lastName;
		System.out.println(Arrays.asList(fullName.split("\\s"))
				.stream()
				.map(str -> str.replace(str.charAt(0), (char)Character.toUpperCase(str.charAt(0))))
				.collect(Collectors.joining(" ")));
		
		
	}
}
