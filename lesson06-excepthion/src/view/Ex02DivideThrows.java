package view;

/**
 * Khi một hàm bị ngoại lệ có 2 cachs để xử lý
 * 1. Bắt(Try/catch) lỗi tại hàm đó
 * 2. Ném ngoại lệ để nơi gọi sẽ bắt, xử lý lỗi đó
 * @author nhonho
 *
 */
public class Ex02DivideThrows {
	public static void main(String[] args) {
		System.out.println("Result: " + divide(4, 2));
		System.out.println("Result: " + divide(5, 0));
	}
	
	//Ném tại vị trí khai báo hàm, nếu chỗ gọi không bắt buộc thì vẫn bị crash app
	//Throws runtime exception(unchecked) --> chỗ gọi không bắt buộc xử lý
	//Throws compile exception(checked)x --> chỗ gọi bắt buộc xử lý
	private static int divide(int a, int b) /*throws ArithmeticException */{
		return a/b;
	}

}
