package work;

public class Ex01 {
	public static void main(String[] args) {
		symmetricalTriangle(7);

	}

	private static void symmetricalTriangle(int n) {
		int mid = n / 2 + 1;
		for (int i = 1; i <= mid; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");

			}
			for (int j = mid + 1; j <= n; j++) {

				if (i == mid) {
					System.out.print(j + " ");
				} else {
					System.out.print(" " + j + " ");
				}

			}
			System.out.println();
		}
		for (int i = mid; i > 1; i--) {

			for (int j = 1; j < i; j++) {
				System.out.print(j + " ");

			}
			for (int j = mid + 1; j <= n; j++) {

				System.out.print(" " + j + " ");

			}

			System.out.println();

		}

	}

}
