package datastructure;

public class Ex01Delcare {
	// attrubutes , variable
	// method , functions 
	public static int LargeNumber = 555;

	// methods funcition
	public static void main(String[] args) {
		// local variables
		// block scope
		int myNum = 8;
		long myBigNum = 999;
		float avgPoint = 8.6f;
		boolean isValid = false;

		System.out.println("Du lieu " + myNum);
		System.out.println("Du lieu so lon " + myBigNum);
		System.out.println("Diem trung binh " + avgPoint);
		System.out.println("Hop le " + isValid);

		System.out.println("Main largeNumber: " + LargeNumber);

		showData();

	}

	private static void showData() {
		int number = 20;
		System.out.println("Du lieu " + number);
		System.out.println("ShowData largeNumber: " + LargeNumber);

	}
}
