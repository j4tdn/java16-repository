package view;

/*
 * khi một hàm bị ngoại lệ. có 2 cách để xử lí
 * 1. bắt lỗi tại hàm đó
 * 2. ném(throw/throws) ngoại lệ để nơi gọi sẽ bắt, xử lý lỗi 
 */
public class Ex02DivideThrows {
	public static void main(String[] args) {
		System.out.println("R1 --> " + divide(4, 2));
		System.out.println("R2 --> " + divide(5, 0));
	}
	// ném tại vị trí khai báo hàm 
	//nếu chỗ gọi ko bắt lỗi thì vẫn bị crash 
	// throws runtime(unchecked) exception --> chỗ gọi không bắt buộc xử lí
	// throws compile(checked) exception --> chỗ gọi bắt buộc xử 
	private static int divide(int a, int b) throws ArithmeticException {
		return a/b;
	}
}
