package datastructure;

public class Ex01Declare {
	// biến toàn cục, thuộc tính
	//global variables = attributes
	public  static int largeNumber = 666;
	
	//method, function
	public static void main(String[] args) {
		// local variables --> giá trị lưu ở STACK
		// block scope
		int myNum = 8;
		long myBigNum = 999l;
		float avgPoint = 8.6f;
		boolean isValid = false;
		
		System.out.println("Dữ liệu" + myNum);
		System.out.println("Dữ liệu số lớn" + myBigNum);
		System.out.println("Điểm trung bình" + avgPoint);
		System.out.println("Hợp lệ" + isValid);
		showData();
		System.out.println("Số lớn" + largeNumber);

		
	}
	private static void showData() {
		int Number = 20;
		System.out.println("Dữ liệu" + Number);
		System.out.println("showData largeNumber : " + largeNumber);
 

	}
}
