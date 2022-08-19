package datastructure;

public class Ex05NamingConvention {
	public static void main(String[] args) {
		// Tên class: Camel case --> Chữ cái đầu tiên viết hoa
		// Tên biến:: Camel case --> Chữ cái đầu tiên là viết thường
		// Tên hàm: Camel case --> chữ cái đầu tiên là viết thường
		int length = 10;
		int salesPrice = 100;
		int a = 5 ;
		int b = 10;
		int result = sum(a,b);
		System.out.println("result: " + result);
	}
	private static int sum(int a, int b) {
		// hàm mà kiểu trả về khác void --> mình phải dùng return
		return a + b;
	}
}
