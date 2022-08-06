package datastructure;

public class Ex01Delcare {
	// attribute, variable
	// method, functions
	public static int lagreNumber = 555;
	
	public static void main(String[] args) {
		int myNum = 8;
		long myBigNum = 999;
		float avgPoint = 8.6f;
		boolean isValid = false;
		
		System.out.println("Du lieu " + myNum);
		System.out.println("Du lieu so lon " + myBigNum);
		System.out.println("Diem trung binh " + avgPoint);
		System.out.println("Hop le " + isValid);
		
		System.out.println("Main largeNumber " + lagreNumber);	
		showData();
	}
	
	private static void showData() {
		int number =20;
		System.out.println("Du lieu " + number);
		System.out.println("ShowData largeNumber " + lagreNumber);	
	}
}
