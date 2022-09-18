package view;

/*
 * Khi một hàm bị ngoại lệ. Có 2 cách để xử lý:
 * 1. Bắt(try/catch) lỗi tại hàm đó
 * 2. Ném(throw/throws ngoại lệ để nơi gọi sẽ xử lý lỗi đó
 */
public class Ex02DivideThrows {
	public static void main(String[] args) {
		// A --> validate
		System.out.println("R1: " + divide(4, 2));
		// B -- arbitrary
		System.out.println("R1: " + divide(3, 0));

		System.out.println("Finish");
	}

// Ném tại vị trí khai báo hàm, nếu chỗ gọi không bắt lỗi thì vẫn bị crash app
// throws runtime(unchecked) exception: chỗ gọi không bắt buộc xử lý
// throws compile(check) exception: chỗ gọi bắt buộc sử lý
	private static int divide(int a, int b) throws ArithmeticException {
		return a / b;
	}
}
