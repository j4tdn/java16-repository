package view;

public class Ex02DivideThrows {
	public static void main(String[] args) {
		// A --> validate
		System.out.println("R1 --> " + divide(4, 2));
		
		// B --> arbitrary
		System.out.println("R2 --> " + divide(5, 0));
		
		System.out.println("Finished ...");
	}
	
	// Ném tại vị trí khai báo hàm
	// Nếu chỗ gọi ko bắt lỗi thì vẫn bị crash app
	
	// throws runtime(unchecked) exception --> chỗ gọi không bắt buộc xử lý
	// throws compile(checked) exception --> chỗ gọi bắt buộc xử lý
	private static int divide(int a, int b) /* throws ArithmeticException */{
		return a/b;
	}
}