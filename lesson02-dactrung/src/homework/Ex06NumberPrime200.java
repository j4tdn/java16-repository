package homework;

public class Ex06NumberPrime200 {
	
	public static void main(String[] args) {
		int n = 0;
		int b = 0;
		while (b < 200) {
			n = n + 1;
			if (checkPrime(n)) {
				b = b + 1;
			}
		}
		System.out.println("Số nguyên tố thứ 200 trong hệ thống số tự nhiên là: " + n);

	}

	private static boolean checkPrime(int n) {
		if (n <= 1)
			return false;
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}
}
