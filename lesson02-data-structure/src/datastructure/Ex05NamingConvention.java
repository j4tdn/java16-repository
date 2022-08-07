package datastructure;

public class Ex05NamingConvention {
	public static void main(String[] args) {
		// Tên class camel case --> chữ cái đầu tiên viết hóa
		// Tên biến camel case --> chữ cái đầu tiên viết thường
		// Tên hàm camel case --> chữ cái đầu tiên viết thường
	    //					  --> từ đầu tên là dộng từ
		int salePrice = 100;
		int length = 10;
		
		int a=5,b=10;
		int result=sum(a, b);
		System.out.println("result ="+result);
		
	}
	private static int sum(int a,int b) {
		//hàm mà kiểu trả về khác void thì phải dùng return
		return a + b;
	}
}
