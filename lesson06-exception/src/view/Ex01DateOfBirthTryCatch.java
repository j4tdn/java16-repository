package view;

import java.time.Year;
import java.util.Scanner;

/**
 * 
 * 
 *
 */
public class Ex01DateOfBirthTryCatch {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		// Cach 1: Tien xu ly

		// Cach 2: Su dung khoi try/catch de bat ngoai le
		int yob = 0;

		do {
			try {
				System.out.print("Enter year of birth: ");
				yob = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input !!!");
				e.printStackTrace();
			}

		} while (true);

		int curYear = Year.now().getValue();
		System.out.println("He is " + (curYear - yob + 1) + " years old");

		ip.close();
	}
}
