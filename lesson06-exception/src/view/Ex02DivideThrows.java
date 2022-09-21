package view;
/**
 * khi bắt 1 hàm bị ngoại lệ. có 2 cách để xử lý
 * bắt lỗi tại hàm đó
 * ném ngoại lệ để nơi gọi sẽ bị bắt xử lí
 * @author Admin
 *
 */

public class Ex02DivideThrows {
	public static void main(String[] args) {
		//A
		System.out.println("Result: " + divide(4,2));
		
		//B
		System.out.println("Resultt: " + divide(5,0));
	}
	//Ném tại vị trí khai báo hàm
	//throws runtime exception -->chỗ gọi bắt buộc xử lí
	//throws compile exception --> chỗ gọi bắt buộc xử lí
	private static int divide(int a , int b) throws ArithmeticException {
		return a/b;
	}

}
