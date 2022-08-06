package datastructure;

public class Ex01Delcare {
	// biến toàn cục, thuộc tính
	// global variables = attributes
   public static int largeNum = 99;
   
   public static void main(String[] args) {
	   //local variables --> giá trị lưu ở STACK
	int myNum = 8;
	long myBigNum = 999l;
	float avpPoint = 8.6f;
	boolean isValid = false;
	System.out.println("Dữ liệu "+ myNum);
	System.out.println("Dữ liệu số lớn "+ myBigNum);
	System.out.println("Dữ liệu DTB "+ avpPoint);
	System.out.println("Hợp lệ "+ isValid);
	
	System.out.println("Main largeNum " + largeNum); 
	
	showData();
}
   private static void showData()
   {
	   int number = 20;
	   System.out.println("Main largeNum " + largeNum);
	   System.err.println("Dữ liệu "+ number);
   }
}
