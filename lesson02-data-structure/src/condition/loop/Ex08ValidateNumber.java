package condition.loop;

import java.util.Scanner;

public class Ex08ValidateNumber {
	public static void main(String[] args) {
		// Enter and validate a number
		// If number of wrong times exceed 3 times --> Exit
		// ip.nextLine() --> string.matches("\\d+")
		// abc a1bc
		Scanner ip = new Scanner(System.in);
		String numberAsText = "";
		int wrongTimes = 0;
		do {
			String wrongTimesAsText = wrongTimes > 0 ? "(" + wrongTimes + ")" : "";
			System.out.println("Enter valid number" + wrongTimesAsText + ": ");
			numberAsText = ip.nextLine();
			if (!numberAsText.matches("\\d+")) {
				wrongTimes++;
				if (wrongTimes == 3) {
					System.out.println("Wrong times = 3 ==>EXIT");
					return;
				}
				continue;
			}
			break;
		} while (true);

		// Validation
		int number = Integer.parseInt(numberAsText);
		System.out.println("value: " + number);
	}
}
