package datastructure;

public class Ex05NamingConvention {
	public static void main(String[] args) {
//		Tên class: Camel case -> Chữ cái đầu tiên viết hoa
//		Tên biến: Camel case -> Chữ cái đầu tiên viết thường
//		Tên hàm: Camel case -> Chữ cái đầu tiên viết thường
//							-> Từ đầu tiên là động từ
		
		int length = 10;
		int salePrice = 100;
		
		int result = sum(length, salePrice);
		System.out.println(result);
	}
	
	private static int sum(int a, int b) {
		return a+b;
	}
}
