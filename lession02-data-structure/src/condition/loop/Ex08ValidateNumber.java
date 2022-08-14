package condition.loop;

import java.util.Scanner;

public class Ex08ValidateNumber {
	public static void main(String[] args) {
		// Enter and validate a number if number of wrong times exceed 3 -> exit system
		// ip.nextLine() -> string.matches("\\%d")
		Scanner ip = new Scanner(System.in);
		String numberAsText = "";
		int wrongTimes = 0;

		// validation

		do {
			String wrongTimesAsText = wrongTimes > 0 ? "(" + wrongTimes + ")" : "";
			System.out.print("Enter valid number" + wrongTimesAsText + ":");
			numberAsText = ip.nextLine();
			if (!numberAsText.matches("\\d+")) {
				wrongTimes++;
				if (wrongTimes == 3) {
					System.out.println("You entered wrong text exceed 3 times");
					// System.exit(0);
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
