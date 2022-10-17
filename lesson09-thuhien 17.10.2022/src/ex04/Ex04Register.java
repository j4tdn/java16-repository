package ex04;
import java.util.Scanner;
import java.util.regex.Pattern;
public class Ex04Register {
	private static Scanner ip = new Scanner(System.in);
	private static boolean flag = true;

	public static void main(String[] args) {
		System.out.println("Enter username: ");
		String username = ip.nextLine();
		do {
			System.out.print("Enter password: ");

			String password = ip.nextLine();
			if (checkPassword(password) == false) {
				System.out.println("Mật Khẩu phải chứa ít nhất 1 chữ số, 1 kí tự in hoa, và một kí tự đặc biệt");
			}else {
				System.out.println("Đăng nhập thành công");
				flag = false;
			}
		} while (flag);
	}

	public static boolean checkPassword(String passWord) {
		String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";

		if (!Pattern.matches(pattern, passWord)) {
			return false;
		}
		return true;
	}
}
