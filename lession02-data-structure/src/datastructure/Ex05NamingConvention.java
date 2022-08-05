package datastructure;

public class Ex05NamingConvention {
	public static void main(String[] args) {
		// Tên class: Camel case --> chữ cái đầu tiên viết hoa
		// Tên biến: Camel case --> chữ cái đầu tiên viết thường
		// Tên hàm: Camel case 	--> 1 từ: chữ cái đầu tiên viết thường
		//						--> nhiều từ: chữ từ đầu tiên viết thường, chữ thứ hai viết hoa
		
		int length = 10;
		int salesPrice = 100;
		
		int a= 5;
		int b = 10;
		int result = sum(a, b);
		System.out.println("result " + result);
		
		
	}
	
	private static int sum(int a, int b) {
		// hàm mà kiểu trả về khác void --> mình phải dùng return
		return a +b;
	}
}
