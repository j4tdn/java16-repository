package ex04;

public class Ex04UniqueNumber {
	public static void main(String[] args) {
		int[] a = { 12, 13, 1, 12, 15, 17, 15 };
		int n = a.length;
		sort(a, n);
		System.out.print("Các phần tử trong mảng xuất hiện 1 lần là: ");
		for (int i = 0; i < n; i++) {
			if (countElement(a, n, a[i]) == 1)
				System.out.print("  " + a[i]);

		}
	}

	public static void sort(int a[], int n) {
		for (int i = 0; i < n; i++) {
			for (int j = i + 1; j < n; j++) {
				if (a[i] > a[j]) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int x : a) {
			System.out.println(x);
		}
	}

	public static int countElement(int a[], int n, int i) {
		int count = 0;
		for (int j = 0; j < n; j++) {
			if (a[j] == i)
				count++;
		}
		return count;
	}

}
