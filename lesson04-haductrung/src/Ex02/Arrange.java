package Ex02;

public class Arrange {
	public static void main(String[] args) {

		int[] arr = { 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18 };

		int temp;
		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 7 == 0 && arr[i] % 5 != 0) {
				temp = arr[count];
				arr[count] = arr[i];
				arr[i] = temp;
				count++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] % 7 == 0 && arr[i] % 5 == 0) || (arr[i] % 7 != 0 && arr[i] % 5 != 0)) {
				temp = arr[count];
				arr[count] = arr[i];
				arr[i] = temp;
				count++;
			}
		}

		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
