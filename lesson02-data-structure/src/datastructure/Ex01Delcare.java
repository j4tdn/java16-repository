package datastructure;

public class Ex01Delcare {
	//attribute, variables 
	//method function
	public static int LargeNumber = 555;
	public static void main(String[] args) {
		//local variables  --> giá trị lưu ở STACK
		//block scope
		int myNum = 8;
		long  myBigNum = 999l;
		float avgPoint = 8.6f;
		boolean isValid = false;
		
		System.out.println("Dữ liệu "+ myNum);
		System.out.println("Dữ liệu số lớn "+ myBigNum);
		System.out.println("Điểm trung bình "+ avgPoint);
		System.out.println("Hợp lệ "+ isValid);
		
		showData();
	}
	
	private static void showData() {
		int number = 20;
		System.out.println("Dữ liệu " +number);
		System.out.println("ShowData largeNumber: " + LargeNumber);
	}
	
}
