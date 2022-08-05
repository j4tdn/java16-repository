package datastructure;

public class Ex05NamingConvention {
	public static void main(String[] args) {
		// Tên class: Camel case --> chữ cái đầu tiên viết hoa
		// tên biến : Camel case --> chữ cái đầu tiên viết thường
		// Tên hàm: Camel case --> chữ cái đầu tiên viết thường
		// 					   --> Từ đầu tiên là động từ
		int length = 10;
		int salesPrice = 100;
		
		int a = 5;
		int b = 10;
		int result = sum(a , b);
		System.out.println("result: " + result);
	}
	
	private static int sum(int a , int b) {
		// ham ma kieu tra ve khac void --> minh phai dung return
		return a + b ;
	}
}
