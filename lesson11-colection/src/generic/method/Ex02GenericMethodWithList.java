package generic.method;

import java.util.Arrays;
import java.util.List;

/*
 * sau khi mình xử lí dữ liệu xong, kết quả có thể trả về
 * List<Double>, List<String>, List<Integer>
 * --> Người dùng muốn in ra dữ liệu từ các mảng đó
 */

public class Ex02GenericMethodWithList {
	public static void main(String[] args) {
		List<Double> dlist = Arrays.asList(1d,2d,3d,4d);
		List<String> slist = Arrays.asList("helli", "halla", "hollo");
		List<Integer> ilist = Arrays.asList(2,4,4,2);
	}
	private static void printfArray(String prefix, List<Object> o) {
		System.out.print(prefix + "-->");
		for(Object item:o) {
			System.out.println(item+" ");
		}
		System.out.println();
	}

}
