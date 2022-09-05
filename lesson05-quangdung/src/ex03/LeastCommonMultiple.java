package ex03;

public class LeastCommonMultiple {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4};
		System.out.println(getLeastCommonMultiple(arr));
	}

	private static int greatestCommonMultiple(int a, int b) {
		if (b == 0)
			return a;
		return greatestCommonMultiple(b, a % b);
	}

	private static int LeastCommonMultiple(int a, int b) {
		return (a * b) / greatestCommonMultiple(a, b);
	}

	private static int getLeastCommonMultiple(int[] arr) {
		int tmp = LeastCommonMultiple(arr[0], arr[1]);
		for (int i = 2; i < arr.length; i++) {
			tmp = LeastCommonMultiple(tmp, arr[i]);
		}
		return tmp;
	}
}
