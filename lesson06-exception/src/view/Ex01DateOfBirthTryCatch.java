package view;

import java.time.Year;
import java.util.Scanner;

public class Ex01DateOfBirthTryCatch {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		int yob = 0;
		do {
			try {
				System.out.println("Enter year of birth: ");
				yob = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("NFE -->error");
				e.printStackTrace();
			}
		}
		while(true);
		
		
		int curYear = Year.now().getValue();
		System.out.println("he is " + (curYear - yob + 1) + "year old");
		ip.close();
	}

}
