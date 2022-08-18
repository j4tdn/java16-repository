package datastructure;

public class Ex05NamingConvention {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//tên class: Canmel case -->Chữ cái đầu tiên viết hoa
		//tên biến : Camel case: --> Chữ cái đầu tiên viết thường 
		//tên hàm: Camel case --> Chữ cái đầu tiên viết thường 
		//					--> Từ đầu tiên động từ 
		int length =10;
		int salesPrice =100;
		int a =5;
		int b =10;
		int result = sum(a,b);
		System.out.println(result);
	}

	private static int sum(int a,int b) {
		// hàm mà kiểu trả về khác void -->mình phải dùng return
		return  a + b;
	}
	
}
