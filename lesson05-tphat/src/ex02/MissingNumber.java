package ex02;

public class MissingNumber {

	public static void main(String[] args) {
		int n = 6;
		int arr[] = { 3, 2, 1, 6, 5 };
		System.out.println(getMissingNumber(arr, n));

	}

	private static int getMissingNumber(int[] arr, int n) {
		int sum = 0;
		int values = n * (n + 1) / 2;
		for (int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		return values - sum;
	}
}
