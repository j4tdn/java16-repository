package view;

public class Ex02 {

	public static void main(String[] args) {
		int[] arr1 = {3,2,1,6,5};
		int[] arr2 = {3,7,9,2,1,6,5,4,10};
		System.out.println(getMissingNumber(arr1)!=-1?getMissingNumber(arr1):"Không tìm thấy");
		System.out.println(getMissingNumber(arr2)!=-1?getMissingNumber(arr2):"Không tìm thấy");

	}
	
	public static int getMissingNumber(int[] arr) {
		int sum1 = 0;
		int sum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			sum1 += i+1;
			sum2 += arr[i];
		}
		return sum1 + arr.length + 1 - sum2;
	}
	
//	public static boolean isContains(int[] arr, int n) {
//		for (int i : arr) {
//			if(i == n) return true;
//		}
//		return false;
//	}

}
