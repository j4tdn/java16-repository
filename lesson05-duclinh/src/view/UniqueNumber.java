package view;

public class UniqueNumber {
	public static void main(String[] args) {
		int[] arr = {3, 15, 21, 0, 15, 17, 21};
		showArrayElements(arr);
	}
	public static void showArrayElements(int []arr) {
		int i, j;
		int flag;
		for (i = 0; i < arr.length-1; i++) {
			flag = 1;
			for (j = 0; j < i-1; j++) {
				if (arr[j] == arr[i]) {
					flag = 0;
					break;
				}
			}

			if (flag == 1) {
				System.out.print(" "+arr[i]);
			}
		}
	}
}
