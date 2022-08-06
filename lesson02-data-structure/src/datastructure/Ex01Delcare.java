package datastructure;

public class Ex01Delcare {
	//attributes, variable
	//method, function
	public static int largeNumber = 555;
	
	
	public static void main(String[] args) {
		//local variables -->STACK
		int myNum = 8;
		long myBigNum = 999l;
		float avgPoin = 8.6f;
		boolean isValid = false;
		System.out.println("Dữ liệu " +myNum);
		System.out.println("Số lớn " +myBigNum);
		System.out.println("Điểm trung bình " +avgPoin);
		System.out.println("giá trị " +isValid);
		showData();
	}
	private static void showData() {
		int number = 20;
		System.out.println(+number);
		System.out.println(+largeNumber);
	}
}

