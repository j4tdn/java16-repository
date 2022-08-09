package datastructure;

public class Ex01Delcare {
	// bien toàn cục, thuộc tính
	// global variable = attributes
	public static int largeNumber = 555;
	// method, functions
	public static void main(String[] args) {
		//local variables -> gia tri luu o Stack
		// block scope
		int myNum = 8;
		long myBigNum = 999l;
		float avgPoint = 8.6f;
		boolean isValid = false;
		System.out.println("du lieu " + myNum);
		System.out.println("so lon " + myBigNum);
		System.out.println("diem trung binh " + avgPoint);
		System.out.println("hop le " + isValid);
		System.out.println("main largeNumber" + largeNumber);
		showData();
	}
	
	private static void showData() {
		int number = 20;
		System.out.println("du lieu " + number);
		System.out.println("showData largeNumber" + largeNumber);
	}

}
