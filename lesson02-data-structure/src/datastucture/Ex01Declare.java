package datastucture;

public class Ex01Declare {
	// global variables = attributes
	public static int largeNumber = 555;
	// Atrributes, variable
	// method, functions
	public static void main(String[] args) {
		//variables
		//block scope
		int myNum = 8;
		long myBigNum = 999l;
		float avgPoint = 8.6f;
		boolean isValid= false; 
		
		System.out.println("Du lieu "+ myNum);
		System.out.println("Du lieu so lon "+ myBigNum);
		System.out.println("Diem trung binh "+ avgPoint);
		System.out.println("Hop le "+ isValid);
		
		System.out.println("Main largeNumber"+ largeNumber);
		showData();
	}
	private static void showData() {
		int number = 20;
		System.out.println("Du lieu "+number);
		System.out.println("ShowData largeNumber: "+largeNumber);
	}
}
