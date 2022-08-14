package condition.loop;

import java.util.Scanner;

public class Ex08ValidateNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ip = new Scanner(System.in);
		String numberAsText = "";
		int wrongTimes = 0;
		do {
			String wrongTimeAsText = wrongTimes > 0 ? "" : "";
			System.out.println("Enter Valid Number " + wrongTimeAsText + ": ");
			numberAsText = ip.nextLine();
			if(numberAsText.matches("\\d+")) {
				wrongTimes++;
				if(wrongTimes == 3) {
					System.out.println("Wrong time == 3 --> Exit");
					return;
				}
			}
		}while(true);
	}

}
