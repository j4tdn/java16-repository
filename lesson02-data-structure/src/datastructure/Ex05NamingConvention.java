package datastructure;

public class Ex05NamingConvention {
	public static void main(String[] args) {
		// Tên class: Camel case --> chữ cái đầu tiên viết hoa
		// Tên biến : Camel case--> Chữ cái đầu tiên viết thường
		// Têm hàm: Camel case --> Chữ cái đầu tiên là viết thường 
		//					--> từ đầu tiên là động từ
		int length =10;
		int salesPrice  = 100;
		int a = 5;
		int b = 10;
		int result = sum(a, 10);
		System.out.println("result: " +result);
	}
	private static int sum(int a, int b) {
		// hàm trả về khác void thì mình dùng return
		b = 5;
		return a + b; 
	}
}
