package datastructure;

public class Ex05NamingConvention {
	public static void main(String[] args) {
		//Tên class: Camel case --> Chữ cái đầu tiên viết hoa
		//Tên biến : Camel case --> Chữ cái đầu tiên viết thường
		//Tên hàm : Camel case --> Chữ cái đầu tiên viết thường
		
		
		int length = 10;
		int salesPrice = 100;
		
		int a = 5;
		int b = 10;
		System.out.println(sumOfTwoNumbers(a, b));
	}
	private static int sumOfTwoNumbers(int a, int b) {
		return a + b;
	}
}
