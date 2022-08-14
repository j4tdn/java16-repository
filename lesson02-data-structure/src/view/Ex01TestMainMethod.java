package view;

public class Ex01TestMainMethod {
	//debugging: 
	//breakpoint: điểm dừng
   public static void main(String[] args) {
	System.out.println("Main method");
	anotherMainMethod();
	
   }
   
   //tạo hàm mới để chia nhỏ bài toán + tái sử dụng
   //declaration: khai báo
   private static void anotherMainMethod() {
	   System.out.println("Fake main method");
   }
}
