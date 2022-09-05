package exam;

public class ex02FindNumber {
	public static void main(String[] args) {
		int N = 5;
		int arr[] = { 5, 3, 2, 1, 2 };

		getMissingNumbers(arr, N);
	}

	public static void getMissingNumbers(int arr[], int N) {
		for (int i = 0; i < N; i++) {
			arr[Math.abs(arr[i]) - 1] = -(Math.abs(arr[Math.abs(arr[i]) - 1]));
		}

		for (int i = 0; i < N; i++) {
			if (arr[i] > 0)
				System.out.print(i + 1 + " ");
		}
	}

}
