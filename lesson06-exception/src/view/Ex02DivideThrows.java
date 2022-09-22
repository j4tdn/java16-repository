package view;
/**
 * khi 1 hàm bị ngoại lệ thì
 * 1. bắt(catch) lỗi tại hàm đó
 * 2. ném(throws) ngoại lệ để nơi gọi sẽ bắt, xử lý lỗi đó
 * @author DucTrung
 *
 */
public class Ex02DivideThrows {
	public static void main(String[] args) {
		//A
		System.out.println("Result 1 " +divide(4, 2));
		//B
		System.out.println("Result 2 " +divide(5, 0));
		
		System.out.println("finish ");
	}
	//ném tại vị trí khai báo hàm
	//nếu chỗ gọi không bắt lỗi thì vẫn bị crash app
	//throws runtime(unchecked) exception--> chỗ gọi không bắt buộc xử lý
	//throws compile(checked) exception--> chỗ gọi bắt buộc xử lý
	private static int divide(int a, int b) throws ArithmeticException {
		return a/b;
	}

}
