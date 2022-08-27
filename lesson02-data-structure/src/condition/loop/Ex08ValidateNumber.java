package condition.loop;

import java.util.Scanner;

public class Ex08ValidateNumber {
	public static void main(String[] args) {
		// Enter and validate a number
		// If number of wrong times exceed 3 --> Exit
		// ip.nextLine() --> string.matches("\\d+")
		// abc a1bc

		Scanner ip = new Scanner(System.in);
		String numberAsText = "";
		int wrongTimes = 0;
		do {
			String wrongTimesAsText = wrongTimes > 0 ? "("+wrongTimes+")" : "";
			System.out.print("Enter a valid number" + wrongTimesAsText + ": ");
			numberAsText = ip.nextLine();
			if (numberAsText.matches("\\d+")) {
				break;
			}
			wrongTimes++;
			if (wrongTimes == 3) {
				System.out.println("You entered wrong time exceed 3 times --> Exit ");
				return ; // Dừng lại hàm có kiểu trả về là void
				//System.exit(0); //Thoát khỏi chương trình
			/*
			 * if (numberAsText.matches("\\d+")) {
			 * wrongTimes++;
			 * if (wrongTimes == 3) {
				System.out.println("You entered wrong time exceed 3 times --> Exit ");
				return ;
			 * }
			 * continue;
			 * }
			 * break;
			 * } while (true);
			 */
			}
		} while (true);

		int number = Integer.parseInt(numberAsText);
		System.out.println("number: " + number);

		System.out.println("Finish .....");
	}
}
