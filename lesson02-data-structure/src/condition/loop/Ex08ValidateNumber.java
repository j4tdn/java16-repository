package condition.loop;

import java.util.Scanner;

public class Ex08ValidateNumber {
	public static void main(String[] args) {
		// Enter validate number
		// if number of wrong times exceed 3 --> Exit system
		// ip.nextLine() --> string.matches("\\d+")

		Scanner ip = new Scanner(System.in);
		String numberAsText = "";
		int wrongTimes = 0;
		do {
			String wrongTimesAsText = wrongTimes > 0 ? "(" + wrongTimes + ")" : "";
			System.out.println("Enter valid number: " + wrongTimesAsText + " : ");
			numberAsText = ip.nextLine();
			if (!numberAsText.matches("\\d+")) {
				wrongTimes++;
				if (wrongTimes == 3) {
					System.out.println("Wrong time = 3 ==> EXIT");
					return;
				}
				continue;
			}
			break;
		} while (true);
		// Cách 1:
//		wrongTimes++;
//		if (wrongTimes == 3) {
//			System.out.println("Wrong times > 3 ==> EXITS");
//			return; // dừng lại khi có KDL trả về là void
//			// System.exit(0); // thoát khỏi chương trình
//		}
		int number = Integer.parseInt(numberAsText);
		System.out.println("Value: " + number);
	}

}
