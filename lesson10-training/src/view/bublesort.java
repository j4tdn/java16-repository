package view;

public class bublesort {
	public static void main(String[] args) {
		int[] array = { 1, 5, 11, 9, 4, 6 };

		output(array);
		System.out.println();
		System.out.println("sau khi sap sep:");
		boblesort(array);

	}

	private static void output(int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.print("array" + "[" + i + "]:" + array[i] + " ");
		}
	}

	private static void boblesort(int[] array) {
		for (int i = 0; i < array.length - 1; i++) {
			for (int j = array.length - 1 - i; j > 0 + i; j--) {
				if (array[j] > array[j - 1]) {
					int temp = array[j];
					array[j] = array[j - 1];
					array[j - 1] = temp;
				}
			}
		}
		output(array);
	}
}
