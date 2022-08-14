package condition.loop;

import java.util.Scanner;

public class Ex08ValidateNumber {

	public static void main(String[] args) {
		// Enter and validate a number
		// If number of wrong time exceed 3 time -> Exit system
		// ip.nextLine(( ---> string.matches("\\d+")
		// abc a1bc

		Scanner ip = new Scanner(System.in);
		String numberAsText = " ";
		int wrongTimes = 0;
		do {
			String wrongTimeAsText = wrongTimes > 0 ? "("+wrongTimes+")" : "";
			System.out.print("Enter valid a number" +wrongTimeAsText + ": ");
			numberAsText = ip.nextLine();
			if (!numberAsText.matches("\\d+")) {
				wrongTimes++;
			
			if (wrongTimes == 3) {
				System.out.println("Wrong times =3 ==> EXIT");
				return;
			}
			continue;
			}
			break;
			
			/* if (!numberAsText.matches("\\d+")) {
				break;
			}
			if (wrongTimes == 3) {
				System.out.println("You entered wrong text exceed 3 time");
				return; */
				// System.exit(0); //thoát khoi ctrinh
		}while(true);

	// validation

	int number = Integer.parseInt(numberAsText);System.out.println("value: "+number);

}

}
