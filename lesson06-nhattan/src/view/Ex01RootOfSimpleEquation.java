package view;

import java.util.Scanner;

/**
 * 	Giải phương trình bậc nhất ax + b = 0 . Các hệ số nhập vào từ bàn phím. Sử
 	dụng try - catch để bẫy các lỗi khi nhập sai kiểu dữ liệu, ví dụ nhập số
	nhưng nhập chữ. Bẫy lỗi chia 0, trường hợp xảy ra lỗi phải thông báo cho
	người dùng biết và nhập lại đến khi a b hợp lệ thì in ra kết qua x = -b/a
 */

public class Ex01RootOfSimpleEquation {
	public static void main(String[] args) {
		do {
			try {
				int a, b;
				Scanner ip = new Scanner(System.in);

				System.out.println("Giải phương trình ax + b = 0");
				System.out.print("Nhập a: ");
				a = Integer.parseInt(ip.nextLine());
				System.out.print("Nhập b: ");
				b = Integer.parseInt(ip.nextLine());
				System.out.println("Kết quả: " + rootOfSimpleEquation(a, b));
				return;
			} catch (NumberFormatException | ArithmeticException e) {
				e.printStackTrace();
			}
		} while (true);
	}

	private static double rootOfSimpleEquation(int a, int b) {
		if (a == 0) {
			throw new ArithmeticException("a must be != 0");
		}
		return (double) -b / a;
	}
}
