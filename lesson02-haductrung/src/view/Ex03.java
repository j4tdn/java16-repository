package view;

public class Ex03 {
	public static void main(String[] args) {

		int k = 1131;
		if (checkNumberReserved(k) == true) {
			System.out.println("la so doi xung");
		} else {
			System.out.println("khong phai so doi xung");
		}
	}

	private static boolean checkNumberReserved(int n) {
		int reserved = 0, origin;
		origin = n;
		while (n != 0) {
			int tmp = n % 10;
			reserved = reserved * 10 + tmp;
			n = n / 10;
		}
		if (reserved == origin) {
			return true;
		} else {
			return false;
		}
	}

}
