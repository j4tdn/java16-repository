package datastructure;

public class Ex01Declare {
	//static --> giai thich sau
	
	// bien toan cuc, thuoc tinh
	// global variables = attributes
	public static int largeNumber = 500; 
	
	// methods, functions
	public static void main(String[] args) {
		//variables --> gia tri luu o STACK
		//block scope
		int myNum = 8;
		long myBigNum = 999;
		float avgPoint = 8.6f;
		boolean isValid	= false;
		
		System.out.println("Du lieu " + myNum);
		System.out.println("Du lieu so lon " + myBigNum);
		System.out.println("Du lieu diem trung binh " + avgPoint);
		System.out.println("Hop le " + isValid);
		
		System.out.println("Main largeNumber: " + largeNumber);
		
		showData();
	}
	
	private static void showData() {
		int number = 20;
		System.out.println("Du lieu " + number);
		System.out.println("ShowData largeNumber: " + largeNumber);
	}
}
