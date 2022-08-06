package datastructure;

public class Ex01Delcare {
	//static -->giải thích sau 
	
	// global variables = attributes
	// biến toàn cục, thuộc tính
	public static int largeNumber = 555;
	// method, functions
	public static void main(String[] args) {
		// variables --> giá trị lưu ở STACK
		// block scope
		int myNum = 8;
		long myBigNum = 999l;
		float avgPoint = 8.6f;
		boolean isValid = false;

		System.out.println("Dữ liệu " + myNum);
		System.out.println("Dữ liệu số lớn " + myBigNum);
		System.out.println("Điểm trung bình " + avgPoint);
		System.out.println("Hơp lệ " + isValid);
		
		System.out.println("Main largeNumber " + largeNumber);
		
		showData();
	}

	private static void showData() {
		int Number = 20;
		System.out.println("Dữ liệu " + Number);
		System.out.println("showData largeNumber " + largeNumber);
	}
}
