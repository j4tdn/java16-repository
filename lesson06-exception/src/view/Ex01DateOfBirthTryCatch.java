package view;

import java.time.Year;
import java.util.Scanner;

/**
 * 1. Enter a year of birth -- Calculate age of candidate
   >> Introduce : A - Validate data before execute Integer.parse with Regex
		          B - Using try catch
                    - Add conditional to break
 */
public class Ex01DateOfBirthTryCatch {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
			
		// NumberFormatException
		// Xử lý ngoại lệ
		
		// Cách 1: Tiền xử lý - Đảm bảo dữ liệu chính xác để không bao giờ xảy ra ngoại lệ khi thực thi
		
		// Cách 2: Sử dụng khối try/catch để bắt ngoại lệ --> chương trình tiếp tục thực thi khi ngoại lệ xảy ra
		// Lưu ý: Nên dùng chính xác exception xảy ra trong catch
		// Khi khối try bị nhiều exception --> Sử dụng exception cha để cover
		int yob = 0;
		
		do {
			try {
				System.out.print("Enter year of birth: ");
				yob = Integer.parseInt(ip.nextLine());
				break;
			} catch (NumberFormatException e) {
				System.out.println("Invalid input !!!");
				e.printStackTrace();
			}
		} while(true);
		
		int curYear = Year.now().getValue();
		System.out.println("He is " + (curYear - yob + 1) + " years old");
	
		ip.close();
	}
}