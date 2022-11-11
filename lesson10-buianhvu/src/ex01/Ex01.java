package ex01;

import java.util.Arrays;

public class Ex01 {
	public static void main(String[] args) {
		int[] arr = { 7, 8, 8, 8, 6, 2, 5, 1 };
		System.out.println("--------------------------");
		System.out.print("{  ");
		RmSame(arr, arr.length);
		System.out.println("}");
		System.out.println("--------------------------");
		Compare(arr, arr.length);
		System.out.println("--------------------------");
		TheThird(arr, arr.length);
	}
	// prob1 :

	private static void RmSame(int[] a, int n) {
		int count;
		for (int i = 0; i <= n - 1; i++) {
			count = 0;
			for (int j = 0; j <= n - 1; j++) {
				if (a[i] == a[j] && i != j) {
					count = 1;
				}
			}
			if (count == 0)
				System.out.print(a[i] + "  ");
		}
	}

	// prob2 :

	private static void Compare(int[] a, int n) {
		int S1 = 0, S2 = 0;
		for (int i = 0; i <= n / 2 - 1; i++) {
			S1 += a[i];
		}
		for (int k = n - 1; k >= n / 2; k--) {
			S2 += a[k];
		}

		if (S1 > S2) {
			System.out.println(">");
		} else if (S1 == S2) {
			System.out.println("=");
		} else {
			System.out.println("<");
		}

	}

	// prob3 :

	private static void TheThird(int[] a, int n) {

		Arrays.sort(a);
		for (int i = n - 3; i > 0; i--) {
			if (a[i] != a[i - 1] && a[i] != a[i + 1] && a[i + 1] != a[i + 2]) {
				//if(a[i + 2] != a[i + 3])
				System.out.println(a[i]);
				break;
			}

		}

	}
}