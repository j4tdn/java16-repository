package datastructure;

public class Ex01Delcare {
	// Biến toàn cục, thuộc tính
	// global variable = attribute
	// thêm static để g�?i được biến toàn cục
	public static int largeNumber = 100;

	public static void main(String[] args) {
		// local variable: biến cục bộ
		
		int myNum = 8;
		long myBitNum = 999l;
		float avgPoint = 8.6f;
		boolean isValid = false;
		
		System.out.println("Dữ liệu "+myNum);
		System.out.println("Dữ liệu số lớn "+myBitNum);
		System.out.println("�?iểm trung bình "+avgPoint);
		System.out.println("Hợp lệ "+isValid);
		
		System.out.println("Main largeNumber: "+largeNumber);
		
		showData();
	}
	
	private static void showData() {
		int number = 20;
		System.out.println("Dữ liệu "+number);
		System.out.println("ShowData largeNumber: "+largeNumber);
	}

}
