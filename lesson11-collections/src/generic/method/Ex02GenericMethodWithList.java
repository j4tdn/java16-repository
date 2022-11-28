package generic.method;

import java.util.Arrays;
import java.util.List;

/**
 * Sau khi xử lý dữ liệu xong kết quả có thể trả về 
 * List<Integer>, List<Double>, List<Item>, List<String>
 * 
 * --> người dùng muốn in ra kq từ mảng đó
 */
public class Ex02GenericMethodWithList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Double> dList = Arrays.asList(1d, 2d, 3d, 4d);
		List<String> sList = Arrays.asList("s1", "s2", "s3", "s4");
		List<Integer> iList = Arrays.asList(1, 2, 3, 4);
		printArrayGeneric("dList" ,dList);
		// printArrayGeneric("sList" ,sList);
		printArrayGeneric("iList" ,iList);
	}
	
	private static void printArrayGeneric(String prefix, List<? extends Number> Es) {
		System.out.print(prefix + "--> : ");
		for (Object item : Es) {
			System.out.print(item + " ");
		}
		System.out.println();
	}

}
