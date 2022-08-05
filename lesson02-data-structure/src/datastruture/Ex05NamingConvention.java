package datastruture;

public class Ex05NamingConvention {

	public static void main(String[] args) {
		// tên class: Camel case --> Chữ cái đầu tiên là viết hoa
		// Tên biến: Camel case --> Chữ cái đầu tiên viết thường
		// Tên hàm: Camel case --> Chữ cái đầu tiên viết thường
		//					   --> Từ đầu tiên là động từ
		int lenght = 10;
		int salesPrice = 100;
		
		int a = 5;
		int b = 10;
		int result = sum(a, b);
		System.out.println("result: " + result);
		
	}
	
	private static int sum(int a, int b) {
		// hàm mà kiểu trả về khác void --> mình phải dùng return
		return a + b;
	}
}
