package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01DateOfBirthTryCatch {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int yearOfBirth = 0;
		while (true) {
			System.out.print("Enter year of birth:");
			try {
				yearOfBirth = Integer.parseInt(ip.nextLine());
				break;
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
		int current = Year.now().getValue();
		System.out.println("He is " + (current - yearOfBirth + 1) + " years old");
		ip.close();
	}
}
