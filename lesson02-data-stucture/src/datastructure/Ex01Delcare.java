package datastructure;

public class Ex01Delcare {
	private static String muNum;
	//biến toàn cực, thuộc tính
	//global variables -->attributes
	
	//method, functions
	public static int largeNumber =555;
	
	public static void main(String[]args) {
		//local variables-->giá trị lưu trữ ở STACK
		//block scope
		int myNum = 8;
		long muBigNum = 999l;
		float avgPoint =8.6f;
		boolean isValid = false;
	
		

		System.out.println("Dữ liệu" + myNum);
		System.out.println("Dữ liệu số lớn" + muBigNum);
		System.out.println("Điểm trung bình" + avgPoint);
		System.out.println("Hợp lệ" + isValid);
		System.out.println("Main umber: " + largeNumber);
		showData();
		
	}
	private static void showData() {
		int number = 20;
		System.out.println("Dữ liệu"+ number);
		System.out.println("showData largeNumber:" + largeNumber);
	}
}
