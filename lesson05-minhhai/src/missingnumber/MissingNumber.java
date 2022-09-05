package missingnumber;

public class MissingNumber {
	public static void main(String[] args) {
		int[] a = { 1, 2, 5, 4, 6, 7, 8, 9, 10 };
		System.out.println(getMissingNumber(a));
	}

	private static int getMissingNumber(int[] a) {
		int i = 1;
		int j = 0;
		for (i = 1; i <= 10; i++)
			for (j = 0; j <= 9;) {
				if (!(i == a[j])) {
					j++;
				}
			}
		return i;
	}
}
