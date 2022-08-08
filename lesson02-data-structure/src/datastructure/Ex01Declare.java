package datastructure;

public class Ex01Declare {
	// static -->
	// biến cục bộ,thuộc tính
	// global variables =attributes
	public static int largeNumber = 555;

	// method,function
	/* access modifier --> public,private,... */
	public static void main(String[] args) {
		// variable --> giá trị lưu trữ ở STACK
		// phạm vi sử dụng = block scope {}
		int mynum = 8;
		long myBigNum = 999l;
		float avgPoint = 8.6f;
		boolean isValid = false;

		System.out.println("Dữ liệu " + mynum);
		System.out.println("Dữ liệu số lớn " + myBigNum);
		System.out.println("Dữ liệu trung bình " + avgPoint);
		System.out.println("Dữ liệu đúng sai " + isValid);

		System.out.println("Main largelNUmber " + largeNumber);

		showdata();
	}

	private static void showdata() {
		int number = 20;
		System.out.println("Dữ liệu " + number);
		System.out.println("show data Main largeNUmber " + largeNumber);
	}
}
