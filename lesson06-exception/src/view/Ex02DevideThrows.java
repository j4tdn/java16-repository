package view;

/**
 * 
 * Khi 1 hàm bị ngoại lệ. Có 2 cách để xử lý
 * 1. Bắt lỗi tại hàm đó
 * 2. Ném(throw/throws) ngoại lệ để nơi gọi sẽ bắt, xử lý lỗi đó
 */
public class Ex02DevideThrows {
	public static void main(String[] args) {
		// A
		System.out.println("R1 --> " + devide(4, 2));
		
		// B
		System.out.println("R2 --> " + devide(5, 0));
	}
	// ném tại vị trí khai báo hàm 
	//nếu chỗ gọi ko bắt lỗi thì vẫn bị crash app
	
	// throws runtime(unchecked) exception --> chỗ gọi ko cần xử lý
	// throws compile(checked) exception --> chỗ gọi bắt buộc  xử lý
	private static int devide(int a, int b) throws ArithmeticException {
		return a/b;
	}
}
