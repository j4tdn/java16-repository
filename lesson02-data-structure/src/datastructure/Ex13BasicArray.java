package datastructure;

public class Ex13BasicArray {
	public static void main(String[] args) {
		//Mảng là kiểu dữ liệu đố tượng
		//5 là độ dài length của mảng
		//tạo 1 ô nhớ ở vùng nhớ heap lưu 5 giá trj mặc định của kiểu int
		int[] digits=new int[5];
		
		System.out.println("digit[0] ="+digits[0]);
		System.out.println("digit[1] ="+digits[1]);
		
		digits[1]=99;
		System.out.println("digits[1]="+digits[1]);
		
		//khở tạo ô nhớ và gán giá trị cho mảng
		
		String[] sequences ={"a","b","c","d"};
		System.out.println("length: "+sequences.length);
		
		//for-index
		for(int i=0; i < sequences.length;i++) {
			System.out.println("value: "+sequences[i]);
		}
		System.out.println("==========");
		//for-each -->lấy gái trị không quan tâm chỉ số
		//each tên biến
		for(String each: sequences) {
			System.out.println("each: "+each);
		}
	}
}