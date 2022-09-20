package view;
/*
 * khi 1 cái hàm bị ngoại lệ: có 2 cách xử lí
 * 1. bắt lỗi tại hàm đó
 * 2. ném(Throw/Throws) ngoại lệ để nơi gọi sẽ bắt, xử lí lỗi đó
 */
public class Ex02DivideThrows {
	public static void main(String[] args) {
		// A --> validate
		System.out.println("R1: " + divide(4,2));
		
		// B --> arbitrary
		System.out.println("R2: " + divide(4,0));
		
		System.out.println("Finish !!!!");
	}
	// Ném tại vị trị khai báo hàm
	// Nếu chỗ gọi không bắt lỗi thì vẫn bị crash app
	
	// throws runtime(unchecked) exception --> chỗ gọi không bắt buộc xử lí
	// throws compile(checked) exception --> chỗ gọi bắt buộc xử lí
	private static int divide(int a, int b) throws ArithmeticException {
		return a/b;
	}
}
