package view;

import java.time.Year;
import java.util.Scanner;

/*
 * 1 Enter a year of birth -- Calculate age of candidate
 * Introduce : A validate dât before execute nterger.Parse with rege
 */
public class Ex01DateOfBirthTryCatch {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
//		System.out.println("enter year of birth: ");
//		int yob = Integer.parseInt(ip.nextLine());

		// NumberFormat Exception
		// Xử lý ngọa lệ - Đảm bảo dữ liệu là chính xác để không bao giờ xảy ra ngoại lệ
		// khi thực thi

		// Cách 2: Xử dụng khối trycatch để bắt ngoại lệ --> để chương trình tếp tục
		// thực thi khi ngoại lệ xảy ra
		// Lưu ý: nên dùng chính xác exception xảy ra trong catch
		// khi khố try bị nhiều exception --> sử dụng exception cha để cover
		int yob = 0;
		do {
			try {
				System.out.println("enter year of birth: ");
				yob = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input !!!");
				e.printStackTrace();
			}
		} while (true);

		int curYear = Year.now().getValue();
		System.out.println("He is " + (curYear - yob + 1) + " years old");

		ip.close();
	}
}
