package view;

import java.util.Scanner;
import java.util.regex.Pattern;

/**
 * 	Viết chương trình kiểm tra tính hợp lệ của mật khẩu khi đăng ký tài khoản
	Mật khẩu phải thỏa mãn các điều kiện sau đây. 
	Lặp lại các bước kiểm tra điều kiện cho đến khi đăng ký tài khoản thành công.
	Nếu thông tin nhập vào không hợp lệ sẽ ném ra các ngoại lệ, lỗi tương ứng, 
	sau đó thông báo cho người dùng biết và cho phép nhập lại.
 */

public class Ex02ValidationPassword {
	public static void main(String[] args) {
		
		do {
			try {
				System.out.print("Enter password: ");
				String password = new Scanner(System.in).nextLine();
				if(isValidPassword(password)) {
					System.out.println("Success.");
					break;
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		} while (true);
	}
	
	private static boolean isValidPassword(String password) throws RuntimeException {
		Pattern pLowercase = Pattern.compile("[a-z]");
		Pattern pUppercase = Pattern.compile("[A-Z]");
		Pattern pNumber = Pattern.compile("[0-9]");
		Pattern pSpecialChar = Pattern.compile("[^A-Za-z0-9]");
		
		if (password.length() < 8) {
			throw new RuntimeException("At least 8 characters");
		}
		if (password.length() > 256) {
			throw new RuntimeException("At most 256 characters");
		}
		if (!pLowercase.matcher(password).find()) {
			throw new RuntimeException("At least 1 lowercase alphabetic character.");
		}
		if (!pUppercase.matcher(password).find()) {
			throw new RuntimeException("At least 1 uppercase alphabetic character.");
		}
		if (!pNumber.matcher(password).find()) {
			throw new RuntimeException("At least 1 number.");
		}
		if (!pSpecialChar.matcher(password).find()) {
			throw new RuntimeException("At least 1 special character.");
		}
		return true;
	}
}
