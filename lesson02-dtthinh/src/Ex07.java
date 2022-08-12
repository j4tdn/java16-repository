import java.util.Random;

public class Ex07 {
	public static void main(String[] args) {
		Random rd = new Random();
		int[] A = new int[5];
		for (int i = 0; i < A.length; i++) {
			int num = 0;
			while (!checkNumber(A, num)) {
				num = 20 + rd.nextInt(10);
			}
			A[i] = num;
			System.out.println("Number " + (i) + ": " + (A[i]));
		}
	}

	private static boolean checkNumber(int[] A, int num) {
		for (int i = 0; i < A.length; i++) {
			if (A[i] == num)
				return false;
		}
		return true;
	}
}
