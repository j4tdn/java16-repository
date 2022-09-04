package ex02_divisible;


public class Divisible5and7 {
	// Driver code
	public static void main(String args[]) {
		int[] arr = { 12, 21, 25, 19, 32, 35, 49, 10, 33, 14, 18 };
		
		swapDivisible(arr);
		outPut(arr);
	}	
		
	public static void swapDivisible(int[] arr) {

		int count = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 7 == 0 && arr[i] % 5 != 0) {
				int temp = arr[count];
				arr[count] = arr[i];
				arr[i] = temp;
				count++;
			}
		}
		for (int i = 0; i < arr.length; i++) {
			if ((arr[i] % 7 == 0 && arr[i] % 5 == 0) || (arr[i] % 7 != 0 && arr[i] % 5 != 0)) {
				int temp = arr[count];
				arr[count] = arr[i];
				arr[i] = temp;
				count++;
			}
		}
	}
	public static void outPut(int []arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
