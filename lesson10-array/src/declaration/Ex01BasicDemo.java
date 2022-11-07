package declaration;

import java.util.Arrays;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		/*
		 * Mảng : KDL ĐT
		 * 1. Mảng nguyên thuỷ:int,doub,float,
		 * 2. Mảng ĐT: Integer,String,Item
		 */
	

	//khai báo và khởi tạo
	char[] letters = new char[5];//5 phần tử mang giá trị mặc định của char là ''
	int[] digits = {2,5,8,10};
	int[] numbers = getNums();
	System.out.println("digits: "+ Arrays.toString(digits));
	System.out.println("letters: "+ Arrays.toString(letters));
	System.out.println("numbers: "+ Arrays.toString(numbers));
	
	// khai báo và khởi tạo KĐT
	String[] seqs = new String[6];//6 phần tử null
	Double[] salesPrices = {3.3,4.5,6.8};
	System.out.println("seqs: "+ Arrays.toString(seqs));
}


	
	private static int[] getNums() {
		return new int[] {2,5,8,10};
	}
}