package datastrructure;

public class Ex01Declare {
	
	static int largeNumber = 555;
   public static void main (String[] args) {
	 // variable--> stack  
	   int Mynum = 8;
	   long MyBignum = 999l;
	   float AvgPoint = 8.6f;
	   boolean isValid = false;
	   
	   System.out.println("Dữ liệu " + Mynum);
       System.out.println("Dữ liệu số lớn " + MyBignum);
	   System.out.println("Điểm trung bình " + AvgPoint);
	   System.out.println("Hợp lệ " + isValid);
	   System.out.println("largeNumber: "+largeNumber );
	   
			 
	   showData ();
   }
   
   private static void showData(){
	    int number=20;
	    System.out.println("Dữ liệu " + number);
	    System.out.println("largeNumber: "+largeNumber );
	}
}
