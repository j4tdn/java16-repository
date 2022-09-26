package view;

public class Ex02DivideThrows {

//	khi mot hàm bi ngoại lệ có 2 cách 
	// 1. bắt lỗi tại hàm đó(Try catch)
	//2. Ném (Throws) ngoại lệ để nơi gọi sẽ bắt, xử lý lỗi đó
	public static void main(String[] args) {
		System.out.println("Result 1 : "+ divide(4, 2));
		System.out.println("Result 2 : "+ divide(4, 0));
		
	}
	//Ném tại vị trí khai báo hàm
	//nếu tại chỗ gọi ko bắt lỗi thì vẫn bị crash app
	//throws runtime exception (uncheck) --> chỗ gọi k bắt buộc xử lí
	//throws runtime exception (check) --> chỗ gọi bắt buộc xử lí
	public static int divide(int a,int b) throws ArithmeticException {
		return a/b;
		
	}
}
