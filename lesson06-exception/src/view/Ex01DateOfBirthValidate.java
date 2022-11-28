package view;

import java.time.Year;
import java.util.Scanner;

/*
 * 1 Enter a year of birth -- Calculate age of candidate
 * Introduce : A validate dât before execute nterger.Parse with rege
 */
public class Ex01DateOfBirthValidate {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
//		System.out.println("enter year of birth: ");
//		int yob = Integer.parseInt(ip.nextLine());

		// NumberFormat Exception
		// Xử lý ngọa lệ - Đảm bảo dữ liệu là chính xác để không bao giờ xảy ra ngoại lệ
		// khi thực thi
		String yobAsText = "";
		System.out.println("enter year of birth: ");
		do {
			yobAsText = ip.nextLine();
			if (yobAsText.matches("\\d+")) {
				break;
			}
		} while (true);

		int yob = Integer.parseInt(yobAsText);
		int curYear = Year.now().getValue();
		System.out.println("He is " + (curYear - yob + 1) + " years old");

		ip.close();
	}
}
