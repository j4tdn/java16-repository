package lesson05;

public class Ex03 {

	public static void main(String[] args) {
		int[] a1 = { 2, 3 };
		int[] a2 = { 2, 3, 4 };
		int[] a3 = { 2, 3, 6 };
		int[] a4 = { 2, 5, 10 };

		System.out.println(getLeastCommonMultiple(a1));
		System.out.println(getLeastCommonMultiple(a2));
		System.out.println(getLeastCommonMultiple(a3));
		System.out.println(getLeastCommonMultiple(a4));
	}

	public static int getLeastCommonMultiple(int[] arr) {
		int tmp = 1;
		for (int i : arr) {
			tmp *= i;
		}
		for (int i = 1; i <= tmp; i++) {
			boolean check = true;
			for (int j : arr) {
				if (i % j != 0)
					check = false;
			}
			if (check)
				return i;
		}

		return -1;

	}
}
