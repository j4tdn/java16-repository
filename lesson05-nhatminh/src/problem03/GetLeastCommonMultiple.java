package problem03;

public class GetLeastCommonMultiple {
	public static void main(String[] args) {
		int[] arr1 = { 2, 3 };
		System.out.println("LCM{2, 3}: " + getLCM(arr1));
		int[] arr2 = { 2, 3, 4 };
		System.out.println("LCM{2, 3, 4}: " + getLCM(arr2));
		int[] arr3 = { 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("LCM{2, 3, 4, 5, 6, 7, 8, 9}: " + getLCM(arr3));
	}

	public static int getLCM(int[] arr) {
		int lcmTemp = getLCMofTwo(arr[0], arr[1]);
		for (int i = 2; i < arr.length; i++) {
			lcmTemp = getLCMofTwo(arr[i], lcmTemp);
		}
		return lcmTemp;
	}

	public static int getLCMofTwo(int a, int b) {
		return a * (b / getGCDofTwo(a, b));
	}

	public static int getGCDofTwo(int a, int b) {
		if (b == 0)
			return a;
		return getGCDofTwo(b, a % b);
	}
}
