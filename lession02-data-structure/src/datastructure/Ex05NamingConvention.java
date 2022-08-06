package datastructure;

public class Ex05NamingConvention {
	public static void main(String[] arges) {
		//Tên class: Camel case--->chữ cái đầu tiên viết hoa
		// Tên biến: Camel case--->chữ cái đầu tiên viết thường
		//Tên hàm: Camel case--->chữ -------------------------
		//                   --->Từ đầu tiên là động từ
		
		int length = 10;
		int salesPrice = 10;
		
		int a = 5;
		int b = 10;
		int result = sumOfTwoNumbers(a, b);
		System.out.println("result: " + result);
	}
	
	private static int sumOfTwoNumbers(int a, int b) {
		//hàm kiểu trả về khác void --> thì phải dùng return
		return a + b;
	}

}
