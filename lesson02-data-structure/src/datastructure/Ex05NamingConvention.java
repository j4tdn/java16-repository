package datastructure;

public class Ex05NamingConvention {
	public static void main(String[] args) {
		//tên class: Camel case --> chữ cái đầu tiên viết hoa
		//tên biến: Camel case--> chữ cái đầu tiên viết thường
		//tên hàm: Camel case--> Chữ cái đầu tiên viết thường
		//                   --> Từ đầu tiên là động từ
		
		
		int c=sum(5, 15);
		System.out.println("result: "+ c);
	}
	private static int sum(int a,int b) {
		//kiểu trả về khác void thì dùng return
		return a+b;
	}

}
