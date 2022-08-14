package condition;

import java.util.Scanner;

public class Ex08ValidateNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String numberAsString = "";
		int wrongTimes = 0;

		do {
			System.out.print("Enter valid number: ");
			numberAsString = sc.nextLine();
			if (numberAsString.matches("\\d"))
				break;
			wrongTimes++;
			if (wrongTimes==3) {
				System.out.println("You entering wrong text exceeds 3 times --> Exit");
				return;
			}
			sc.close();
		} while (true);

		int number = Integer.parseInt(numberAsString);
		System.out.println("value: " + number);
		
	}
}
