package view;

public class Ex06_200thPrimeNumber {
	public static void main(String[] args) {
		int index = 200;// Input
		if (index == 1)
			System.out.print(2);
		System.out.print(FindPrimeNumberbyIndex(index, 2, 3));
	}

	public static int FindPrimeNumberbyIndex(int index, int founded, int newest) {
		for (int i = newest + 2; index != founded; i += 2) {
			if (PrimeCheck(i)) {
				founded++;
				newest = i;
			}
		}
		return newest;
	}

	public static boolean PrimeCheck(int n) {
		if (n % 2 == 0)
			return false;
		for (int i = 3; i * i <= n; i += 2) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
}
