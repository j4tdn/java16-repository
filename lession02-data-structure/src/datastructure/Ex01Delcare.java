package datastructure;

public class Ex01Delcare {
	// static --> giải thích sau
	// biến toàn cục, thuộc tính
	// global variables = attributes
	public static int largeNumber = 555;
	// methods, functions
	public static void main(String[] args) {
		// local variables --> giá trị lưu trữ ở STACK
		// block scope ( biến dùng trong mục tiêu từ lúc mở ngoặc đến lúc đóng ngoặc)
		int myNum = 8;
		long mybigNum = 999l;
		float avgPoint = 8.6f;
		boolean isValid = false;
		
		System.out.println("Dữ liệu " + myNum);
		System.out.println("Dữ liệu số lớn " + mybigNum);
		System.out.println("Điểm trung bình " + avgPoint);
		System.out.println("Hợp lệ " + isValid);

		System.out.println("Main largeNumber: " + largeNumber);
		showData();
	}
	private static void showData() {
		int number = 20;
		System.out.println("Dữ liệu " + number);
		System.out.println("ShowData largeNumber: " + largeNumber);


	}
	
	
}