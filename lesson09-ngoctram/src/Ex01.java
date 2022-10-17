
public class Ex01 {
	public static void main(String[] args) {
		int[] arr1 = new int[] {2, 8, 9, 1, 6};
		int[] arr2 = new int[] {2, 1, 1, 8, 9};
		Integer[] result = new Integer[arr1.length];
		int count = 0;
		for (int i=0; i < arr1.length; i++) {
			for (int j=0; j < arr2.length; j++) {
				if (arr1[i] == arr2[j]) {
					result[count++] = arr1[i];
					break;
				}
			}
		}
		for (int i=0; i < result.length; i++) {
			if (result[i] != null)
				System.out.print(result[i] + " ");
		}
	}
}
