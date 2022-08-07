package datastructure;

public class Ex05NamingConvention {
	public static void main(String[] args) {
		// tên class --> cữ cái đầu tiên viết hoa
		// tên biến --> chữ cái đầu tiên là viết thường
		//tên hàm --> chữ cái đầu tiên là viết thường 	
		//         --> từ đầu tiên là động từ
		int length = 10;
		int salesPrice = 100;
		int a = 5;
		int b = 10;
		sum(a, b);
		System.out.println("result :" +sum(a, b));
		
		
	}
	private static int sum( int a , int b) {
		return a + b;
	}

}
