package view;

import java.time.Year;
import java.util.Scanner;

/**
 * 1. Enter a year of birth -- Calulate age of candidate Introduce: 
 * A - Validate data befor execute Integer.parse with Regex : 
 * B - Using try catch 
 * 	 - Add condition to break
 */
public class Ex01DateOfBirthTryCatch {

	public static void main(String[] args) {
		/**
		 * Xử lý ngoại lệ
		 * Cách 1: Tiền xử lý - Đảm bảo dữ liệu chính xác để không
		 * bao giờ xảy ra ngoại lệ khi thực thi
		 */
		Scanner ip = new Scanner(System.in);
		String yobAsText = "";
		do {
			//block scope
			System.out.println("Enter year of birth: ");
			yobAsText = ip.nextLine();
			if (yobAsText.matches("\\d+")) {
				break;
			}
		} while (true);
		int yob = Integer.parseInt(yobAsText);
		int curYear = Year.now().getValue();
		System.out.println("He is " + (curYear - yob + 1) + "year old");
		
		ip.close();
	}
}
