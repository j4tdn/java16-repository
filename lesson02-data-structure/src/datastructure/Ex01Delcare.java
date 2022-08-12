package datastructure;

public class Ex01Delcare {
	static int largeNumber = 555;
	public static void main(String[] args) {
		int myNum = 8;
		long myBigNum = 999l;
		float avgPoint = 8.6f;
		boolean isValid = false;
		
		System.out.println("Dữ liệu: " + myNum);
		System.out.println("Dữ liệu số lớn: " + myBigNum);
		System.out.println("Điểm trung bình: " + avgPoint);
		System.out.println("Hop le: " + isValid);
		
		System.out.println("Main largeNumber: " + largeNumber);
		
		showData();
	}
	
	private static void showData() {
		int number = 20;
		System.out.println("Dữ liệu: " + number);
		System.out.println("Showdata	 largeNumber: " + largeNumber);
	}

}
