package condition.lopp;

import java.util.Scanner;

public class Ex08ValidateNumber {

	public static void main(String[] args) {
		// Enter and validate number
		// If number of wrong time exceed 3 --> exit system

		Scanner ip = new Scanner(System.in);
		String numberAsText = "";
		int wrongTimes = 0;
		do {
			String wrongTimeAsText = wrongTimes > 0 ? "(" + wrongTimes + ")" : "";
			System.out.print("Enter your number: " + wrongTimeAsText + ":");
			numberAsText = ip.nextLine();
			if (!numberAsText.matches("\\d")) {
				wrongTimes++;
				if (wrongTimes == 3) {
					System.out.println("Wrong time = 3 ==>Exit");
					return;
				}
				continue;
			}
			break;

		} while (true);

		int number = Integer.parseInt(numberAsText);
		System.out.println("value: " + number);

	}

}
