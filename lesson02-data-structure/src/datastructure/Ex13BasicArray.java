package datastructure;

public class Ex13BasicArray {
	public static void main(String[] args) {
		//mảng là kiểu dữ liệu đối tượng
		// 5 là số phần tử của mảng
		// tạo 1 ô nhớ ở vùng nhớ HEAP lưu 5 gt mặc định của kiểu int
		int[] digits = new int[5];
		System.out.println("digits[0] = " + digits[0]);
		System.out.println("digits[2] = " + digits[2]);
		digits[1] = 99;
		System.out.println("digits[1] = " + digits[1]);
		String[] sequences = {"a", "b", "c", "d"} ;
		System.out.println(sequences.length);
		for ( int i =0 ; i < sequences.length; i++) {
			System.out.println("value: " + sequences[i]);
		}
	}

}
