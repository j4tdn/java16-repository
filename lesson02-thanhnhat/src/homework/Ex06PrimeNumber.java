package homework;

public class Ex06PrimeNumber {
	public static void main(String[] args) {
		int count = 0;
		int x = 2;
		while (true) {
			if (isPrime(x)) {
				System.out.println("Số nguyên tố thứ 200 là: " + x);
				count++;

			}
			if (count == 200) {

			}
			if (x == 2)
				x++;

			else {
				x += 2;
			}
		}

	}

	public static boolean isPrime(int n) {
		for (int i = 2; i < 10000; i++) {
			if (i % 2 == 0) {
				return false;
			}

		}
		return true;
	}

}
