package view;

public class Ex06PrimeNumber {
	public static void main(String[] args) {
		int i = 0;
		int count = 0;
		do {
			i++;
			if (prime(i)) {
				count++;
				System.out.println("i: " + i + " " + count);
			}
		} while (count < 200);
		System.out.println("số nguyên tố thứ " + count + " là: " + i);
	}

	private static boolean prime(int number) {
		if (number < 2)
			return false;
		for (int i = 2; i <= Math.sqrt(number); i++) {
			if (number % i == 0)
				return false;
		}
		return true;
	}
}
