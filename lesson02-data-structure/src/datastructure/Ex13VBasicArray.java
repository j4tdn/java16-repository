package datastructure;

public class Ex13VBasicArray {
	public static void main(String[] args) {
		// Mảng là kiểu đối tượng
		// 5 là độ dài của mảng
		// Tạo 1 ô nhớ trong vùng nhớ HEAP lưu 5 giá trị mặc định của int
		int[] digits = new int[5];
		
		System.out.println("digits[0] = " + digits[0]);
		System.out.println("digits[2] = " + digits[0]);
		
		// gán giá trị
		digits[1] = 99;
		System.out.println("digits[1] = " + digits[1]);
		
		// Khởi tạo ô nhớ và giá trị cho mảng
		String[] sequences = {"a", "b", "c", "d"};
		System.out.println("length: " + sequences.length);
		
		// for-index[0-length)
		for (int i = 0; i < sequences.length; i++) {
			System.out.println("value: " + sequences);
		}
	
		System.out.println("==============");
		// for-each(element) --> lấy giá trị không qtâm chỉ số
		for(String each: sequences) {
			System.out.println("each: " + each);
		}
		
		// Từ khoá break, continue trong vòng lặp
	}
}
