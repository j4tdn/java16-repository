package datastructure;

public class Ex01Declare {
	// static --> giải thích sau
	// biến toàn cục, thuộc tính
	// global variables = attributes
	public static int largeNumber = 555;
	
	// methods, functions
	public static void main(String[] args) {
		//
		int myNum = 8;
		long myBignum = 999l;
		float avgPoint = 8.6f;
		boolean isValid = false;
		System.out.println("Dữ liệu " + myNum);
		System.out.println("Dữ liệu số lớn " + myBignum);
		System.out.println("Điểm trung bình " + avgPoint);
		System.out.println("Hợp lệ " + isValid);
		System.out.println("Main largeNumber: " + largeNumber);
	}
	private static void showData() {
		int number = 20;
		System.out.println("Dữ liệu " + number);
		System.out.println("Main largeNumber: " + largeNumber);
	}
}

