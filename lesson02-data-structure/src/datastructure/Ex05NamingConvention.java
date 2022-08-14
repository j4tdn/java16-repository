package datastructure;

public class Ex05NamingConvention {
	public static void main(String[] args) {
		// Tên class: Camel case --> Chữ cái đầu tiên viết hoa
		// Tên biến: Camel case --> Chữ cái đầu tiên viết thường
		// Tên hàm: Camel case --> Chữ cái đầu tiên viết thường
		//                     -->Từ đầu tiên là động từ
		int length = 10;
		int salesPrice = 100;
		
		int a = 5; 
		int b = 10;
		int result = sum(a, b);
		System.out.println("result: " + result);
		
	}
	private static int sum(int a, int b) {
		//hàm mà kiểu trả về khác void --> dùng return
		return a + b;
	}

}
