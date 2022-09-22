package view;

import java.time.Year;
import java.util.Scanner;

/*
 * 1. Enter a year of birth
   >> Calculate age of candidate
   >> Introduce : A - Validate data before execute Integer.parse with Regex
		  B - Using try catch
 */

/*
 * Xử lý ngoại lệ
 * C1: tiền xử lý -> Đảm bảo dữ liệu chính xác để ko bao giờ xảy ra ngoại lệ khi thực thi
 * C2: sử dụng try catch để bắt ngoại lệ -> ctr tiếp tục thực thi khi ngoại lệ xảy ra
 * => Lưu ý nên dùng exception chính xác xảy ra trong catch
 * => Khi khối try có nhiều exception -> Sử dụng exception cha
 */
public class Ex01DateOfBirthTryCatch {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int yob = 0;
		do {
			try {
				System.out.print("Enter year of birth: ");
				yob = Integer.parseInt(sc.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input");
//				e.printStackTrace();
			}
		} while (true);
		int curYear = Year.now().getValue();
		System.out.println("She is " + (curYear - yob) + " years old");
		sc.close();
	}
}
