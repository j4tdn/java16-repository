package condition.loop;

public class Ex05Testing {
	public static void main(String[] args) {
		// Viết 1 hàm tìm max của 2 số a, b int
		System.out.println("max: " + max(2,4));
	}
	
	private static int max(int a, int b) {
		// Toán tử 3 ngôi: N1 = (expression) ? N2 : N3
		/*
		 * Sử dụng khi N2 và N3 đơn giản (ít biểu thức code)
		 * if (expression) {
		 	N1 = N2;
		 	} else {
		 	N2 = N3;
		 	}
		 	
		 */
		
		return a > b ? a : b;
	}
}
