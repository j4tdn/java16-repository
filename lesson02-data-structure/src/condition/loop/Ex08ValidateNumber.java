package condition.loop;

import java.util.Scanner;

public class Ex08ValidateNumber {
	public static void main(String[] args) {
		// Enter and validate a number
		// if number of wrong times axceed 3 --> Exit system
		// ip.nextLine()-->String.matches("

		Scanner ip = new Scanner(System.in);
		String numberAsText = "";
		int wrongTimes = 0;
		do {
			String wrongTimesAsText = wrongTimes > 0 ? "(" + wrongTimes + ")" : "";
			System.out.println("" + wrongTimesAsText + " : ");
			numberAsText = ip.nextLine();
			if (!numberAsText.matches("\\d+")) {
				wrongTimes++;
				if (wrongTimes == 3) {
					System.out.println("Wrong times = 3 ==> EXIT");
					return;
				}
				continue;
			}
			break;
		} while (true);
		// validation
		int number = Integer.parseInt(numberAsText);
		System.out.println("value: " + number);

		System.out.println("value: " + number);
	}
}
