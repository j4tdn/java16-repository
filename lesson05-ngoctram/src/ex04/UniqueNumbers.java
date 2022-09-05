package ex04;

public class UniqueNumbers {
	public static int[] sort(int[] A) {
		for (int i = 0; i < A.length - 1; i++) {
			for (int j = i; j < A.length; j++) {
				if (A[j] < A[i]) {
					int temp = A[j];
					A[j] = A[i];
					A[i] = temp;
				}
			}
		}
		return A;
	}
	
	public static Integer[] getUniqueNumbers(int[] A) {
		sort(A);
		System.out.print("A --> ");
		for (int i = 0; i < A.length; i++) {
			System.out.print(A[i] + "   ");
		}
		System.out.println();
		Integer[] result = new Integer[10];
		int j = 0;
		for (int i = 0; i < A.length; i++) {
			if (i == 0) {
				if (A[i] == A[i+1]) {
					continue;
				}
			}
			else if (i == A.length - 1) {
				if (A[i] == A[i-1]) {
					continue;
				}
			}
			else if (A[i] == A[i+1] || A[i] == A[i-1]) { 
				continue;
			}
			result[j] = A[i];
			j++;
		}
		return result;
	}
	

	public static void main(String[] args) {
		int[] A = new int[] { 3, 15, 21, 0, 15, 17, 21};
		Integer[] result = getUniqueNumbers(A);
		for (int i = 0; i < result.length; i++) {
			if (result[i] != null)
				System.out.print(result[i] + "    ");
		}
	}
}
