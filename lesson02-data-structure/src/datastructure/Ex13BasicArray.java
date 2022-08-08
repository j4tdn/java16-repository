package datastructure;

public class Ex13BasicArray {
	public static void main(String[] args) {
		// Mảng là kiểu dữ liệu đối tượng 
		// 5 là độ dài của mảng
		// Tạo 1 ô nhớ ở vùng nhớ HEAP lưu 5 giá trị mặc định của kiểu int
		
		int[] digits = new int[5];
		System.out.println("Digits[0] : " + digits[0]);
		System.out.println("Digits[2] : " + digits[2]);
		
		// Gán giá trị
		digits[1] = 99;
		System.out.println("Digits[1] : " + digits[1]);
		
		// Vừa khởi tạo ô nhớ và gán giá trị cho mảng
		
		String[] sequeces = new String[] {"a", "b", "c", "d"};
		System.out.println(sequeces.length);
		
		// for - index[ 0-length() ]
		for (int i = 0; i < sequeces.length; i++) {
			System.out.print(sequeces[i] + " ");
		}
		System.out.println("");
		System.out.println("=======================");
		// for - each
		for (String value : sequeces) {
			System.out.print(value + " ");
		}
		
		// Từ khóa break, continue trong vòng lặp
	}
}
