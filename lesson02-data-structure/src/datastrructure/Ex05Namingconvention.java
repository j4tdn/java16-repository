package datastrructure;

public class Ex05Namingconvention {
	public static void main(String[] args) {
		//Ten class: Camel case--> Chữ cái đầu tiên viết hoa
		//Tên biến: Camel case--> Chữ cái đầu tiên viết thường
		//Tên hàm: Camel case--> Chữ cái đầu tiên viết thường, từ đầu tiên là động từ 
		
		int lenght =10;
		int salePrice= 100;
		
		int a=5;
		int b=10;
		int result = sum(a,b);
		System.out.println("result: "+result);
	}
     private static int sum(int a, int b) {
    	 //hàm mà trả về khác void -->dùng return
    	 return a+b;
     }
}
