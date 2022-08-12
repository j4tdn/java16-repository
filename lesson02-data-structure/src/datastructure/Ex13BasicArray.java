package datastructure;

public class Ex13BasicArray {
public static void main(String[] args) {
	// Mảng là kiểu dữ liệu đối tượng
	// 5 là độ dài length của mảng
	// Tạo 1 ô nhớ ở vùng nhớ HEAP lưu 5 giá trị mặc định của kiểu int
	
	int[] digits = new int[5];

	System.out.println("degits[0] = " + digits[0]);
	
	String[] sequences = {"a", "b", "c", "d"};
	System.out.println(sequences.length);
	
	// for -  index[0 - length)
	
	for ( int i = 0; i< sequences.length;i++)
	{
		System.out.println("value: " + sequences[i]);
	}
	
	// for - each(element) --> lấy giá trị không quan tâm chỉ số
	// each là tên biến mình đặt
	for(String each: sequences)
	{

        System.out.println("each: " + each);
	}
}
}
