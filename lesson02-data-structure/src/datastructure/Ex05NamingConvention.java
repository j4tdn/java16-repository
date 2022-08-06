package datastructure;

public class Ex05NamingConvention {

	public static void main(String[] args) {
		// Tên class: Camel case --> Chữ cái đầu viết hoa
		// Tên biến: Camel case --> Chữ cái đầu viết thư�?ng
		// Tên hàm: Camel case --> Chữ cái đầu viết thư�?ng, từ đầu tiên là động từ
		
		int salesPrice = 100;
		int length = 10;
		
		int a = 5;
		int b = 10;
		int result = sum(a, b);
		System.out.println("Result "+ result);

	}
	
	private static int sum(int a, int b) {		
		return a + b;		
	}

}
