package view;
/**
 * Khi 1 hàm bị ngoại lệ. Có 2 cách để xử lý
 *  1. Bắt lỗi tịa hàm đó
 *  2. Ném(throw/throws) ngoại lệ để nơi gọi sẽ bắt, xử lý lỗi đó
 * @author ADMIN
 *
 */
public class Ex02DivideThrow {
	public static void main(String[] args) {
		int R1 = divide(4, 2);
		int R2 = divide(5, 0);
		System.out.println("R1 " + R1);
		System.out.println("R2 " + R2);
	}
	
	// Ném tại vị trí khai báo hàm
	// Nếu chổ gọi ko bắt lỗi thì vẫn bị crash
	
	// throw runtime(unchecked) exception --> chổ gọi không bắt buộc xử lý
	// throw compile(checked) exception --> chổ gọi bắt buộc xử lý
	private static int divide(int a, int b) throws ArithmeticException {
		return a/b;
	}
}
