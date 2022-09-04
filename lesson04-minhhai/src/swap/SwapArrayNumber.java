package swap;

public class SwapArrayNumber {
	public static void main(String[] args) {
		int[] a = { 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18 };
		isDivisibleBy7(a);
		isDivisibleBy5(a);
		System.out.println("Day so sau khi sap xep: ");
		System.out.println(a);
	}

	private static void isDivisibleBy7(int[] a) {
		int i = 0;
		for (int s : a) {
			if (s % 7 == 0 && !(s % 5 == 0)) {
				s = a[i];
				i++;
			}
		}
	}

	private static void isDivisibleBy5(int[] a) {
		int i = 10;
		for (int s : a) {
			if (!(s % 7 == 0) && s % 5 == 0) {
				s = a[i];
				i--;
			}
		}
	}
}
