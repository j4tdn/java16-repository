package view;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 	Viết chương trình cho phép nhập địa chỉ email từ bàn phím. 
  	Kiểm tra email nếu không hợp lệ thì thông báo lỗi vào yêu cầu nhập lại 
  	cho đến khi hợp lệ và in ra. 
	Thông tin định dạng email hợp lệ mô tả như sau
 */

public class Ex03ValdationEmail {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		String email;
		while (true) {
			try {
				System.out.println("Enter email: ");
				email = ip.nextLine();
				if (isValidEmail(email)) {
					System.out.println("OKK.");
					break;
				}
			} catch (RuntimeException e) {
				e.printStackTrace();
			}
		}
	}

	private static boolean isValidEmail(String email) {
		Pattern pDomain = Pattern.compile("@mail.com$");
		Pattern pFrefix = Pattern.compile("^[a-z0-9]+([\\._-]?[a-z0-9]+)+@");

		if (!pDomain.matcher(email).find()) {
			throw new RuntimeException("Emails must contain @mail.com domain ");
		} 
		if (!pFrefix.matcher(email).find()) {
			throw new RuntimeException(
					"Allowed characters: letters (a-z), numbers, underscores, periods, and dashes. \n"
				+	"An underscore, period, or dash must be followed by one or more letter or number.");
		}
		return true;
	}
}
