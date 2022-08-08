package condition.loop;

public class Ex05Testing {
	public static void main(String[] args) {
		// Viết 1 hàm tìm Max của 2 số a và b int
		System.out.println("max: " + max(2,4));
	}
	
	private static int max(int a, int b) {
		// toán tử 3 ngôi: N1 = (expression) ? N2 : N3
		/*
		 * if (expression) {
		 * N1 = N2;
		 * } else {
		 * N1 = N3;
		 * }
		 */
		
		return a > b ? a : b;
	}
}
