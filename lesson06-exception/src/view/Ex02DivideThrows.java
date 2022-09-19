package view;

/*
 * Khi 1 hàm bị ngoại lệ. Có 2 cách để xử lý
 * 1. Bắt (try/catch) lỗi tại hàm đó
 * 2. Ném (throw/throws) ngoại lệ để nơi gọi sẽ bắt, xử lý lỗi đó
 */
public class Ex02DivideThrows {
	public static void main(String[] args) {
		// A
		System.out.println("R1 --> " + divide(4, 2));
		// B
		System.out.println("R2 --> " + divide(5, 0));

		System.out.println("Finished...");
	}

	// Ném tại vị trí khai báo hàm
	// Nếu chỗ gọi không bắt lỗi thfi vẫn bị crash app
	// throws runtime exception --> chỗ gọi không bắt buộc xủ lý
	// throws compile exception --> chỗ gọi bắt buộc xử lý
	public static int divide(int a, int b) /* throws Exception */ {
		return a / b;
	}
}
