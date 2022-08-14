package datastruture;

public class Ex13BasicArray {
	public static void main(String[] args) {
		// Array: mảng là kiểu dữ liệu đối tượng
		// 5: độ dài của mảng
		// tạo 1 ô nhớ ở vùng nhớ HEAP lưu 5 "giá trị mặc định" của kiểu int
		int[] digist = new int[5];

		System.out.println("digits[0] = " + digist[0]);
		System.out.println("digits[2] = " + digist[2]);

		// gán giá trị
		digist[1] = 99;
		System.out.println();
		System.out.println("digits[1] = " + digist[1]);

		// vừa khởi tạo ô nhớ và gán giá trị cho mảng
		String[] sequences = { "a", "b", "c", "d" };
		System.out.println("length: " + sequences.length);

		// for-index[0-length)
		for (int i = 0; i < sequences.length; i++) {
			System.out.println("Value: " + sequences[i]);
		}
		System.out.println("================================");
		// for-each(element) --> lấy giá trị không quan tâm chỉ số
		for (String each : sequences) {
			System.out.println("each: " + each);
		}
	}
}
