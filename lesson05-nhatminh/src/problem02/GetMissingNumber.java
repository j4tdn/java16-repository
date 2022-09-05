package problem02;

public class GetMissingNumber {
	public static void main(String[] args) {
		int[] arr1 = { 3, 2, 1, 6, 5 };
		System.out.println("n = 6, Ak = [3,2,1,6,5] -> Result: " + getMissingNumber(6, arr1));

		int[] arr2 = { 3, 7, 9, 2, 1, 6, 5, 4, 10 };
		System.out.println("n = 10, Ak = [3,7,9,2,1,6,5,4,10] -> Result: " + getMissingNumber(10, arr2));
	}

	public static int getMissingNumber(int n, int... arr) {
		int total = 0;
		for (int i : arr)
			total += i;
		return ((n + 1) * (n / 2) - total);
	}
}
