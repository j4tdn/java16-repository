package view;

public class Ex02 {

	public static void main(String[] args) {
		int[] arr1 = {3,2,1,6,5};
		int[] arr2 = {3,7,9,2,1,6,5,4,10};
		System.out.println(getMissingNumber(arr1)!=-1?getMissingNumber(arr1):"Không tìm thấy");
		System.out.println(getMissingNumber(arr2)!=-1?getMissingNumber(arr2):"Không tìm thấy");

	}
	
	public static int getMissingNumber(int[] arr) {
		for (int i = 1; i <= arr.length+1; i++) {
			if(!isContains(arr, i)) return i;
		}
		return -1;
	}
	
	public static boolean isContains(int[] arr, int n) {
		for (int i : arr) {
			if(i == n) return true;
		}
		return false;
	}

}
