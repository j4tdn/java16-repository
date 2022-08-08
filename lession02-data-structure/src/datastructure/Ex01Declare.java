package datastructure;

public class Ex01Declare {
	//global variables = attributes
	public static int largeNumber = 555;
	
	//methods, functions
	public static void main(String[] args) {
		// local variables --> giá trị lưu trữ ở STACK
		// myNum chỉ được sử dụng trong phạm vi block scope {}
		int myNum = 8;
		long myBigNum = 999l;
		float avgPoint = 8.6f;
		boolean isValue = false;
		
		System.out.println("Dữ liệu " + myNum);
		System.out.println("Số lớn " + myBigNum);
		System.out.println("Điểm trung bình " + avgPoint);
		System.out.println("Hợp lệ " + isValue);
		
		System.out.println("Main largeNumber " + largeNumber);
		
		showData();
		
	}

	private static void showData() {
		int number = 20;
		System.out.println("Dữ liệu " + number);
		System.out.println("showData largeNumber " + largeNumber);
	}
}
