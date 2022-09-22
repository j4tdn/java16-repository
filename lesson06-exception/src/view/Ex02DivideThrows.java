package view;

/*
 * khi 1 hàm bị ngoại lệ.Có 2 cách để xử y,.
 * 1/Bắt lỗi tạo hàm tại đó
 * Ném (throws/Throws) ngoại lệ để nơi gọi là sẽ bắt,xử lý lỗi đó
 * 
 */
public class Ex02DivideThrows {
	public static void main(String[] args) {

		// A-->validate
		System.out.println("R1--> devide(4,2)");

		// b --> arbtrary
		System.out.println("R1--> devide(5,0)");

		System.out.println("Finished .....");
	}

	// Ném tại vị trí khai báo hàm
	// throws runtime(unchecked) exception -->chỗ gọi không bị bắt buộc xử lý
	// throws comlile(checked) exception --> chỗ gọi bắt buộc xử lý

	private static int devide(int a, int b) throws ArithmeticException {
		return a / b;
	}
}
