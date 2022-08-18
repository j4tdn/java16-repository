package view;

public class Ex06Prime {
	public static void main(String[] args) {
		int i = 0, j = 0;
		while (j == 200) {
			if (primeCheck(i) == true) {
				j += 1;
			}
			i++;
		}
		System.out.println("So nguyen to thu 200 la: " + j);
	}

	private static boolean primeCheck(int n) {
		if (n < 2) {
			return false;
		}

		for (int i = 2; i < (n - 1); i++) {
			if (n % i == 0) {
				return false;
			}
		}

		return true;
	}
}
