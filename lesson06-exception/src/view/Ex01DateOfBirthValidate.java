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
 * 
 */
public class Ex01DateOfBirthValidate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String yob = "";
		do {
			System.out.print("Enter year of birth: ");
			yob = sc.nextLine();
		} while (!yob.matches("\\d+"));
//		matches("\\d") --> [0,9] but matches("\\d+") -> [0, vo cung)
//		matches("\\d{0,5}")
		int yob_int = Integer.parseInt(yob);
		int curYear = Year.now().getValue();
		System.out.println("She is " + (curYear - yob_int) + " years old");
		sc.close();
	}
}
