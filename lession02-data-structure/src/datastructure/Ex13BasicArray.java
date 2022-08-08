package datastructure;

import javax.swing.AbstractCellEditor;

public class Ex13BasicArray {
	public static void main(String[] args) {
		// Mảng là kiểu dữ liệu đối tượng
		// 5 là độ dài length của mảng
		//Tạo 1 ô nhớ ở vùng nhớ HEAP lưu 5 giá trị mặc định của kiểu int
		int [] digits = new int[5];
		
		System.out.println("digits[0] = " + digits[0]);
		System.out.println("digits[2] = " + digits[2]);
		digits[1] = 99;
		System.out.println("digits[1] = " + digits[1]);
		
		// Vừa khởi tạo ô nhớ và giá trị cho mảng
		String[] sequences = {"a", "b", "c", "d"};
		System.out.println("length: " + sequences.length);
		
		// for-index[0-length)
		for (int i = 0; i < sequences.length; i++) {
			System.out.println("value: " + sequences[i]);
		}
		System.out.println("===========");
		// for-each(element) --> lấy giá trị ko quan tâm chỉ số
		// each: tên biến
		for (String each: sequences) {
			System.out.println("each: " + each);
			
	 // Tìm hiểu từ khoá break, continue trong vòng lặp
		}
	}

}
