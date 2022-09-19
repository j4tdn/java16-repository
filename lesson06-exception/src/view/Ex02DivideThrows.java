package view;

/**
 * Khi một hàm bị ngoại lệ. Có 2 cách để xử lý 1. Bắt (try/cathc) lỗi tại hàm đó
 * 2. Ném (throw/throws) ngoại lệ để nơi gọi sẽ bắt, xử lý lỗi đó
 *
 */
public class Ex02DivideThrows {

	public static void main(String[] args) {
		System.out.println("R1--> " + divide(4, 2));
		System.out.println("R2--> " + divide(5, 0));
	}

	// Ném tại vị trí khai báo hàm, nếu chỗ gọi không bắt lỗi thì vẫn bị crash app
	// throws runtime (unchecked) exception --> Chỗ gọi không bắt buộc xử lý
	// throws compile (checked) exception --> Chỗ gọi bắt buộc xử lý
	private static int divide(int a, int b) throws ArithmeticException {
		return a / b;
	}

}
