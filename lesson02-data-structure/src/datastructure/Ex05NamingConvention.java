package datastructure;

public class Ex05NamingConvention {
	public static void main(String[] args) {
		//tên class: Camel case --> chữ cái đầu tiên viết 
		//tên biến: Camel case --> chữ cái đầu tiên là viết thường 
		//tên hàm: Camel case --> chữ cái đầu tiên là viết thường 
		//					 --> từ đầu tiên là động từ
		int length = 10;
		int salesPrice = 100;
		System.out.println("a " + length);
		System.out.println("b " + salesPrice);
		
		int a = 5;
		int b = 10;
		int result = sumOfTwoNumbers(a, b);
		System.out.println("result: " + result);

	}
	
	private static int sumOfTwoNumbers(int a, int b) {
		return a + b;
	}

}
