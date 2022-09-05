package ex02;

public class MissingNumber {
	
	public static void main(String[] args) {
		int[] arr = { 3, 2, 1, 6, 5 };
		int[] arr2 = { 3, 7, 9, 2, 1, 6, 5, 4, 10 };
		System.out.println(getMissingNumber(arr));
		System.out.println(getMissingNumber(arr2));
	}

	private static int getMissingNumber(int[] arr) {
		int dem;
		for (int i = 1; i <= arr.length; i++) {
			dem = 0;
			for (int j = 0; j < arr.length; j++) {
				if (i == arr[j]) {
					dem++;
					break;
				}
			}
			if (dem == 0) {
				return i;
			}
		}
		return 0;
	}
}
