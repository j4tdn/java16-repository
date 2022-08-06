package datastructure;

public class Ex01Declcare {
    //static --> giải thích sau  
	// attributes
	//biến toàn cục, thuộc tính
	// global variable = attributes
	public static int largeNumber = 555;
	
   // method, functions
	public static void main(String[] args) {
		// variables --> giá trị lưu ở STACK
		int myNum = 8;
		long myBigNum = 999l;
		float avgPoint = 8.6f;
		boolean isValid = false;
		
		System.out.println(" dữ liệu " + myNum);
		System.out.println(" dữ liệu số lớn " + myBigNum);
		System.out.println(" điểm trung bình" + avgPoint);
		System.out.println(" hợp lệ " + isValid);
		
		System.out.println("Main largeNumber:" + largeNumber);
		showData();
	}
	private static void showData() {
		int number = 28;
		System.out.println("dữ liệu " + number);
		System.out.println("showdata largeNumber:" + largeNumber);
	}
}
